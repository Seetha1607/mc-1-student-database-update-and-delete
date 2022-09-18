/*
 *Author Name : Seetha Lakshmi.G.M
 *Date : 18-09-2022
 *Created With : IntelliJ IDEA Community Edition
 */


package com.jap.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentRepository {

    /**
     * It deletes a student record from the database
     *
     * @param connection The connection object that is used to connect to the database.
     * @param rollNumber The roll number of the student whose data is to be deleted.
     * @return The number of rows affected by the query.
     */
    public boolean deleteStudentData(Connection connection, int rollNumber) throws SQLException {

        String deleteQuery = "DELETE FROM `school`.`student` WHERE (`roll_number` = ?);";
        int numberOfRowsAffected;
        try (PreparedStatement preparedStatement = connection.prepareStatement(deleteQuery)) {
            preparedStatement.setInt(1, rollNumber);
            numberOfRowsAffected = preparedStatement.executeUpdate();
        }
        return numberOfRowsAffected > 0;
    }


    /**
     * It updates the student data in the database
     *
     * @param connection The connection object that is used to connect to the database.
     * @param rollNumber The roll number of the student whose data is to be updated.
     * @param name       The name of the student
     * @param grades     The grade of the student.
     * @param totalMarks The total marks of the student.
     * @return The number of rows affected by the update query.
     */
    public boolean updateStudentData(Connection connection, int rollNumber, String name, int grades, double totalMarks) throws SQLException {
        int numberOfRowsAffected = 0;
        String updateQuery = "UPDATE `school`.`student` SET `name` = ?,`grades`= ?,`total_marks`= ? WHERE (`roll_number` = ?);";
        try (PreparedStatement preparedStatement = connection.prepareStatement(updateQuery)) {
            preparedStatement.setInt(1, rollNumber);
            preparedStatement.setString(2, name);
            preparedStatement.setString(3, String.valueOf(grades));
            preparedStatement.setDouble(4, totalMarks);
            preparedStatement.executeUpdate();
        }
        return numberOfRowsAffected > 0;
    }
}
