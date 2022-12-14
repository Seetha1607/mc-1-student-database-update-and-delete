/*
 *Author Name : Seetha Lakshmi.G.M
 *Date : 18-09-2022
 *Created With : IntelliJ IDEA Community Edition
 */


package com.jap.service.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseService {
    // Declaring a variable.
    private static final String URL = "jdbc:mysql://localhost:3306/school";
    // Declaring a variable.
    private static final String USERNAME = "root";
    // A variable declaration.
    private static final String PASSWORD = "Seetha@007";

    // A variable declaration.
    private Connection connection;

    public DatabaseService() {
        this.connection = null;
    }

    public Connection getConnection() {
        return connection;
    }

    /**
     * It connects to the database.
     *
     * @return A boolean value.
     */
    public boolean connect() throws ClassNotFoundException, SQLException {

        // 1. load the jdbc driver into the program memory
        // Class.forName("com.mysql.cj.jdbc.Driver");

        // 2. create a connection object using the DriverManager class
        connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

        // 3. check if the connection is successful
        return connection != null;
    }

    /**
     * If the connection is not null, print "Connected to the database", otherwise print "Not connected to the database"
     */
    public void printConnectionStatus() {
        if (connection != null) {
            System.out.println("Connected to the database");
        } else {
            System.err.println("Not connected to the database");
        }
    }
}