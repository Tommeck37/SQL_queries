package pl.coderslab.mysql.modification;

public class Main02 {
    private String query1a = "select count(*) from tickets;";
    private String query1b = "select sum(quantity) from tickets;";
    private String query2 = "select type, count(*) from payments group by type;";
    private String query3 = "select avg(price) from tickets;";
    private String query4 = "select * from payments order by payment_date desc limit 1, 5;";
    private String query5 = "select type, count(*) as size from payments group by type having size > 2;";
    private String query6 = "select sum(quantity) from tickets where price > 23.15;";

}
