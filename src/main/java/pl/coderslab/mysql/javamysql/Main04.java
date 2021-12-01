package pl.coderslab.mysql.javamysql;

import java.sql.Connection;
import java.sql.SQLException;

public class Main04 {
    private static String movies = "select * from movies;";
    public static void main(String[] args) {
        try (Connection connection = DBUtil.connectToCinemas()) {
            DBUtil.printData(connection, movies, "title", "description", "rating");
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }
}
