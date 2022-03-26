package pl.coderslab.mysql.onetoone;

public class Main01 {
    private String create = "create table client_address (client_id int, city varchar(50), street varchar(50), house_nr varchar(10), " +
            "primary key (client_id), foreign key (client_id) " +
            "references clients(id));";

    private String insert1 = "insert into clients (name, surname) values ('Artur 1', 'Hacia 1');";
    private String insert2 = "insert into clients (name, surname) values ('Artur 2', 'Hacia 2');";
    private String insert3 = "insert into clients (name, surname) values ('Artur 3', 'Hacia 3');";
    private String insert4 = "insert into clients (name, surname) values ('Artur 4', 'Hacia 4');";
    private String insert5 = "insert into clients (name, surname) values ('Artur 5', 'Hacia 5');";

    private String insert6 = "insert into client_address values (1, 'Warszawa', 'Bracka', '23');";
    private String insert7 = "insert into client_address values (1, 'Warszawa', 'Bracka', '24');";
    private String insert8 = "insert into client_address values (1, 'Warszawa', 'Bracka', '25');";
    private String insert9 = "insert into client_address values (1, 'Warszawa', 'Bracka', '26');";
    private String insert10 = "insert into client_address values (1, 'Warszawa', 'Bracka', '27');";
}
