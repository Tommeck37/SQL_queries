package pl.coderslab.mysql.javamysql;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class Main03 {
    private static String cinemas = "insert into cinemas (name, address) values (?, ?);";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nazwę kina");
        String name = scanner.nextLine();
        System.out.println("Podaj adres kina");
        String address = scanner.nextLine();
        addCinema(name, address);
    }

    static void addCinema(String name, String address) {
        try (Connection connection = DBUtil.connectToCinemas()) {
            DBUtil.insert(connection, cinemas, name, address);
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }
}
