package Gestió_de_Cinema;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DatabaseManager
{
    private Connection connection;

    public void connect() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://192.168.56.101:3306/student", "postgres", "mysecretpassword");
            System.out.println("Connexio establerta.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void addMovie(String title, String director) {}


    public void addDirector(String name) {}

    public void getMoviesForDirector(String director) {}

    public void disconnect() {}
}
