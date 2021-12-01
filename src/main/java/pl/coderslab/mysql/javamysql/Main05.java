package pl.coderslab.mysql.javamysql;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class Main05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ID filmu do skasowania");
        String line = scanner.nextLine();
        try {
            int movieId = Integer.parseInt(line);
            try (Connection connection = DBUtil.connectToCinemas()) {
                DBUtil.remove(connection, "movies", movieId);
            } catch (SQLException exception) {
                exception.printStackTrace();
            }
        } catch (NumberFormatException exception) {
            System.out.println("Podany numer ID nie jest cyfrą");
        }
    }
}
