package pl.coderslab.mysql.jointable;

public class Main04 {
    String query1 = "select * from categories_sub join categories on categories_sub.main_id = categories.id where categories.id = 1;";
    String query2 = "select distinct id, name from categories join categories_sub on categories.id = categories_sub.main_id;";
}
