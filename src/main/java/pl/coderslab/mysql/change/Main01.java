package pl.coderslab.mysql.change;

public class Main01 {
    private String query1 = "alter table tickets add priceUSD decimal(4,2);";
    private String query2 = "alter table movies add director char(80);";
    private String query3 = "alter table movies modify column director varchar(50);";
    private String query4 = "alter table tickets drop column priceUSD;";
}
