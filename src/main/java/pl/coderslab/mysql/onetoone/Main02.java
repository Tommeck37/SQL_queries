package pl.coderslab.mysql.onetoone;

public class Main02 {
    String create = "CREATE TABLE payments (id int AUTO_INCREMENT, type varchar(8), payment_date date, PRIMARY KEY(id), foreign key (id) references tickets(id));";

    // Jeśli chcemy zmodyfikować istniejącą tabelę
    String modify1 = "alter table payments modify column id int;";
    String modify2 = "ALTER TABLE payments ADD FOREIGN KEY (id) REFERENCES tickets(id);";
}
