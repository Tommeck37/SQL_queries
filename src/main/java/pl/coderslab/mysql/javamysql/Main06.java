package pl.coderslab.mysql.javamysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main06 {
    public static void main(String[] args) {
        try (Connection connection = DBUtil.connectToCinemas()) {
            String ratingQuery = "select avg(rating) from movies;";
            PreparedStatement statement = connection.prepareStatement(ratingQuery);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                Double rating = resultSet.getDouble(1);
                String moviesQuery = "select * from movies where rating > ?;";
                PreparedStatement moviesStatement = connection.prepareStatement(moviesQuery);
                moviesStatement.setDouble(1, rating);
                ResultSet moviesResult = moviesStatement.executeQuery();
                while (moviesResult.next()) {
                    System.out.println(moviesResult.getString("id") + ", "
                            + moviesResult.getString("title") + ", "
                            + moviesResult.getString("description") + ", "
                            + moviesResult.getString("director") + ", "
                            + moviesResult.getString("watchCount") + ", "
                            + moviesResult.getString("isTop"));
                }
            }
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }
}
