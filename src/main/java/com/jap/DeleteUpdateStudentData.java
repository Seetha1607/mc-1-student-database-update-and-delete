package com.jap;

import com.jap.repository.StudentRepository;
import com.jap.service.database.DatabaseService;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * Hello world!
 */
public class DeleteUpdateStudentData {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        // Creating an instance of the DatabaseService class.
        DatabaseService databaseService = new DatabaseService();
        try {
            databaseService.connect();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        databaseService.printConnectionStatus();

        // Creating a new instance of the Scanner class.
        Scanner input = new Scanner(System.in);
        Connection connection = databaseService.getConnection();
        StudentRepository studentRepository = new StudentRepository();

        System.out.println("Delete student details by roll number");
        System.out.println("Enter the roll number");
        int rollNumber = input.nextInt();
        boolean b = studentRepository.deleteStudentData(connection, rollNumber);
        System.out.println(b);

        System.out.println("Update student roll number by total marks");
        System.out.println("Enter total marks");
        double totalMarks = input.nextDouble();

        if (totalMarks == 0) {
            System.out.println("No student found with the given total marks");
        } else {
            System.out.println("Enter the student's updated roll number: ");
            rollNumber = input.nextInt();
            boolean b1 = studentRepository.updateStudentData(connection, rollNumber, totalMarks);
            if (b1) {
                System.out.println("Student's roll number updated successfully");
            } else {
                System.err.println("No student found with the given total marks");
            }
        }
    }
}
