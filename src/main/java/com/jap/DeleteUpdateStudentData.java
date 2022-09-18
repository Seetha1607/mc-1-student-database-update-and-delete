package com.jap;

import java.sql.Connection;

/**
 * Hello world!
 */
public class DeleteUpdateStudentData {

    public static void main(String[] args) {
        DeleteUpdateStudentData salesDataDemo = new DeleteUpdateStudentData();
        salesDataDemo.deleteStudentData();
        salesDataDemo.updateStudentData();
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
