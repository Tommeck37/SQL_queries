package pl.coderslab.mysql.manytomany;

public class Main02 {
    String create = "create table cinemas_movies (id int auto_increment, cinema_id int, movie_id int, primary key (id), foreign key (cinema_id) " +
            "references cinemas(id), foreign key (movie_id) references movies(id));";
}
