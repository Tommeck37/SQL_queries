package pl.coderslab.mysql.jointable;

public class Main05 {
    String query1 = "select * from cinemas join cinemas_movies on cinemas.id = cinemas_movies.cinema_id where movie_id = 1;";
    String query2 = "select * from movies join cinemas_movies on movies.id = cinemas_movies.movie_id where cinema_id = 1;";
}
