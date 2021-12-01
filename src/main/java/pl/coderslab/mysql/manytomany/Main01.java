package pl.coderslab.mysql.manytomany;

public class Main01 {
    private String create = "create table products_orders (id int auto_increment, product_id int, order_id int, primary key (id), foreign key (product_id) references products(id), foreign key (order_id) references orders(id));";

    private String query1 = "insert into orders (description) values ('Opis zamówienia 1');";
    private String query2 = "insert into orders (description) values ('Opis zamówienia 2');";
    private String query3 = "insert into orders (description) values ('Opis zamówienia 3');";

    private String query4 = "insert into products_orders (product_id, order_id) values (1, 1);";
    private String query5 = "insert into products_orders (product_id, order_id) values (2, 1);";
    private String query6 = "insert into products_orders (product_id, order_id) values (3, 1);";
    private String query7 = "insert into products_orders (product_id, order_id) values (1, 2);";
    private String query8 = "insert into products_orders (product_id, order_id) values (2, 3);";
}
