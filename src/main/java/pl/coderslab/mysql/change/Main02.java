package pl.coderslab.mysql.change;

public class Main02 {
    public String query1 = "alter table movies add watchCount int;";
    public String query2 = "alter table movies add isTop tinyint(1) default 0;";
    public String query3 = "alter table cinemas add openTime time;";
    public String query4 = "alter table cinemas add closeTime time;";
}
