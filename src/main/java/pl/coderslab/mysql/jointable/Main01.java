package pl.coderslab.mysql.jointable;

public class Main01 {
    private String query1 = "select * from tickets join payments on tickets.id = payments.id where payments.type = 'cash';";
    private String query2 = "select * from tickets left join payments on tickets.id = payments.id where payments.id is null;";
}
