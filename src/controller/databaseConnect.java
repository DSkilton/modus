package controller;

import java.sql.*;

public class databaseConnect {

    public static Connection getConnection() {

        Connection con = null;

        try {
            //connection
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(Password.URL, Password.USER, Password.PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
            //put this in to see difference between stackTace and .getMessage()
            System.out.println("Something went wrong " + e.getMessage());
        } catch (ClassNotFoundException e) {
            e.getLocalizedMessage();
            e.printStackTrace();
        } finally {


        }
        System.out.println("Connected to Database -> " + con);
        return con;
    }
}