package com.jap;

import com.jap.service.database.DatabaseService;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Hello world!
 */
public class DeleteUpdateStudentData {

    public static void main(String[] args) throws ClassNotFoundException {
        DeleteUpdateStudentData salesDataDemo = new DeleteUpdateStudentData();
        salesDataDemo.deleteStudentData();
        salesDataDemo.updateStudentData();
        // Creating an instance of the DatabaseService class.
        DatabaseService databaseService = new DatabaseService();
        try {
            databaseService.connect();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        databaseService.printConnectionStatus();
    }

    public Connection getConnection() {
        Connection connection = null;

        return connection;

    }

    public void deleteStudentData() {
        // call getConnection() method

        //execute delete query
    }

    public void updateStudentData() {
        // call getConnection() method

        //execute update query
    }
}
