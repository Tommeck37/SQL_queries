package pl.coderslab.mysql.jointable;

public class Main03 {
    String query1 = "select * from products join opinions on products.id = opinions.product_id;";
    String query2 = "select * from products left join opinions on products.id = opinions.product_id;";
    String query3 = "select * from products join opinions on products.id = opinions.product_id where products.id = 1;";
}
