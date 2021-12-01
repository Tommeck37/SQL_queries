package pl.coderslab.mysql.onetomany;

public class Main01 {
    private String create = "create table opinions (id int auto_increment, product_id int not null, description varchar(500), primary key (id), foreign key (product_id) references products(id));";

    private String query1 = "insert into products (name, description, price) values ('Produkt 1', 'Opis 1', 10.10);";
    private String query2 = "insert into products (name, description, price) values ('Produkt 2', 'Opis 2', 10.20);";
    private String query3 = "insert into products (name, description, price) values ('Produkt 3', 'Opis 3', 10.30);";

    private String query4 = "insert into opinions (product_id, description) values (1, 'Opinia 1');";
    private String query5 = "insert into opinions (product_id, description) values (2, 'Opinia 2');";
    private String query6 = "insert into opinions (product_id, description) values (2, 'Opinia 3');";
    private String query7 = "insert into opinions (product_id, description) values (3, 'Opinia 4');";
    private String query8 = "insert into opinions (product_id, description) values (3, 'Opinia 5');";
}
