package pl.coderslab.mysql.jointable;

public class Main02 {
    private String query1 = "select * from orders join products_orders on orders.id = products_orders.order_id where products_orders.product_id = 1;";
    private String query2 = "select * from products join products_orders on products.id = products_orders.product_id where products_orders.order_id = 1;";
}
