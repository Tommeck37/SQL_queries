package pl.coderslab.mysql.javamysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Main07 {
    public static void main(String[] args) {
        try (Connection connection = DBUtil.connectToCinemas()) {
            mainMenu(connection);
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }

    public static void mainMenu(Connection connection) throws SQLException {
        String cinemasQuery = "select * from cinemas;";
        PreparedStatement cinemasStatement = connection.prepareStatement(cinemasQuery);
        ResultSet cinemasResult = cinemasStatement.executeQuery();
        while (cinemasResult.next()) {
            System.out.println(cinemasResult.getString("id") + ", "
                    + cinemasResult.getString("name") + ", "
                    + cinemasResult.getString("address"));
        }
        System.out.println("Wskaż operację do wykonania");
        System.out.println("e - edycja, u - usunięcie, x - wyjście z programu");
        Scanner scanner = new Scanner(System.in);
        String operation = scanner.nextLine();
        if (operation.equals("e") || operation.equals("u") || operation.equals("x")) {
            if (operation.equals("e")) {
                editCinema(scanner, connection);
            }
            if (operation.equals("u")) {
                deleteCinema(scanner, connection);
            }
            if (operation.equals("x")) {
                System.out.println("Program closed");
            }
        } else {
            System.out.println("Nieprawidłowa operacja.");
            mainMenu(connection);
        }
    }

    public static void deleteCinema(Scanner scanner, Connection connection) throws SQLException {
        System.out.println("Podaj ID kina do usunięcia");
        String line = scanner.nextLine();
        try {
            int id = Integer.parseInt(line);
            System.out.println("Potwierdź kasowanie: T/N");
            String decision = scanner.nextLine();
            if (decision.equals("T")) {
                String query = "delete from cinemas where id = ?";
                PreparedStatement statement = connection.prepareStatement(query);
                statement.setInt(1, id);
                statement.executeUpdate();
            }
        } catch (NumberFormatException exception) {
            System.out.println("Podany ID nie jest liczbą");

        }
        mainMenu(connection);
    }

    public static void editCinema(Scanner scanner, Connection connection) throws SQLException {
        System.out.println("Podaj ID kina do edycji");
        String line = scanner.nextLine();
        try {
            int id = Integer.parseInt(line);
            System.out.println("Podaj nową nazwę kina");
            String name = scanner.nextLine();
            System.out.println("Podaj nowy adres kina");
            String address = scanner.nextLine();
            String query = "update cinemas set name = ?, address = ? where id = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, name);
            statement.setString(2, address);
            statement.setInt(3, id);
            statement.executeUpdate();
        } catch (NumberFormatException exception) {
            System.out.println("Podany ID nie jest liczbą");
        }
        mainMenu(connection);
    }
}
