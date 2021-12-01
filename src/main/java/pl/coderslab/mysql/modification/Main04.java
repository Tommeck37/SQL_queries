package pl.coderslab.mysql.modification;

public class Main04 {
    String query1 = "update cinemas set address = 'Stadion Narodowy' where name like '%z';";
    String query2 = "delete from payments where payment_date < (NOW() - INTERVAL 4 DAY);";
    String query3 = "update movies set rating = 5.4 where length(description) > 40;";
    String query4 = "update tickets set price = (price - price/2) where quantity > 10;";
}
