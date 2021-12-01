package pl.coderslab.mysql.javamysql;

import java.sql.*;

public class Main01 {
    public static void main(String[] args) {
        try (Connection connection = DBUtil.connectToProducts()) {
            System.out.println("Hello DB");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
