package pl.coderslab.mysql.modification;

public class Main03 {
    String query1 = "select * from movies where title like 'W%';";
    String query2 = "select * from tickets where price > 15.30;";
    String query3 = "select * from tickets where quantity > 3;";
    String query4 = "select * from movies where rating > 6.5;";
    String query5 = "select * from movies order by rating desc limit 1;";
}
