package pl.coderslab.mysql.onetomany;

public class Main02 {
    String create1 = "create table categories (id int auto_increment, name varchar(50), primary key(id));";
    String create2 = "create table categories_sub (id int auto_increment, main_id int, name varchar(50), primary key (id), foreign key (main_id) " +
            "references categories(id));";
}
