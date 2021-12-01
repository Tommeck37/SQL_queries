package pl.coderslab.mysql.javamysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main02 {
    private static String insertProduct = "insert into products values (?, ?, ?, ?);";
    private static String insertOpinion = "insert into opinions values (?, ?, ?);";
    private static String insertOrder = "insert into orders values (?, ?);";
    private static String insertProductOrder = "insert into products_orders values (?, ?, ?);";
    private static String insertClient = "insert into clients values (?, ?, ?);";
    private static String insertClientAddress = "insert into client_address values (?, ?, ?, ?);";

    public static void main(String[] args) {
        try (Connection connection = DBUtil.connectToProducts()) {
            DBUtil.insert(connection, insertProduct, "100", "Produkt z JAVY", "Opis produktu z JAVY", "99.99");
            DBUtil.insert(connection, insertOpinion, "100", "100", "Bardzo ładny produkt z JAVY");
            DBUtil.insert(connection, insertOrder, "100", "Zamówienie produktu z JAVY");
            DBUtil.insert(connection, insertProductOrder, "100", "100", "100");
            DBUtil.insert(connection, insertClient, "100", "Artur", "Hacia");
            DBUtil.insert(connection, insertClientAddress, "100", "Warszawa", "Uliczna", "69A");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
