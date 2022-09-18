package com.jap;

import com.jap.repository.StudentRepository;
import com.jap.service.database.DatabaseService;

import java.sql.Connection;
import java.sql.SQLException;

public class DeleteUpdateStudentData {

    public static void main(String[] args) throws ClassNotFoundException {

        // Creating an instance of the DatabaseService class.
        DatabaseService databaseService = new DatabaseService();
        try {
            databaseService.connect();
            databaseService.printConnectionStatus();

            Connection connection = databaseService.getConnection();
            StudentRepository studentRepository = new StudentRepository();

            System.out.println("----------------------------------------------");
            System.out.println("Student data delete: ");
            studentRepository.deleteStudentData(connection, 14);
            System.out.println("Student data deleted");
            System.out.println("Student data update :");
            studentRepository.updateStudentData(connection, 16, "Lakshmi", 94, 687);
            System.out.println("Student data updated");
            System.out.println("-------------------------------------------------");

        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }
}
