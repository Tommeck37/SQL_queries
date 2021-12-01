package pl.coderslab.mysql.create;

public class Main04 {
    String createCinemas = "CREATE TABLE cinemas (id int AUTO_INCREMENT, name varchar(50), address varchar(255), PRIMARY KEY(id));";
    String createMovies = "CREATE TABLE movies (id int AUTO_INCREMENT, title varchar(50), description varchar(255), rating decimal(3,2), PRIMARY KEY(id));";
    String createTickets = "CREATE TABLE tickets (id int AUTO_INCREMENT, quantity int, price decimal(4,2), status int(1), PRIMARY KEY(id));";
    String createPayments = "CREATE TABLE payments (id int AUTO_INCREMENT, type varchar(8), payment_date date, PRIMARY KEY(id));";
}
