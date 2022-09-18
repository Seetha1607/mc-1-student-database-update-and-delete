/*
 *Author Name : Seetha Lakshmi.G.M
 *Date : 18-09-2022
 *Created With : IntelliJ IDEA Community Edition
 */


package com.jap.service.database;

import java.sql.Connection;

public class DatabaseService {
    // Declaring a variable.
    private static final String URL = "jdbc:mysql://localhost:3306/school";
    // Declaring a variable.
    private static final String USERNAME = "root";
    // A variable declaration.
    private static final String PASSWORD = "Seetha@007";

    // A variable declaration.
    private final Connection connection;

    public DatabaseService() {
        this.connection = null;
    }

    public Connection getConnection() {
        return connection;
    }
}