package pl.coderslab.mysql.create;

public class Main02 {
    private String products = "create table products (id int auto_increment, name varchar(50), description varchar(255), price decimal(6,2), primary key(id));";
    private String orders = "create table orders (id int auto_increment, description varchar(255), primary key (id));";
    private String clients = "create table clients (id int auto_increment, name varchar(30), surname varchar(50), primary key (id));";

    public static void main(String[] args) {

    }
}
