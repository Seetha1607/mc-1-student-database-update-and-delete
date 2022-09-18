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
     * It updates the roll number of a student with a given roll number to a new roll number
     *
     * @param connection       The connection object that is used to connect to the database.
     * @param updateRollNumber The roll number of the student whose data is to be updated.
     * @param totalMarks       The total marks of the student.
     * @return A boolean value.
     */
    public boolean updateStudentData(Connection connection, int updateRollNumber, double totalMarks) throws SQLException {
        String updateQuery = "UPDATE `school`.`student` set `roll_number` = '?' where (`totalMarks` = '?');";
        int numberOfRowsAffected;
        try (PreparedStatement preparedStatement = connection.prepareStatement(updateQuery)) {
            preparedStatement.setInt(1, updateRollNumber);
            preparedStatement.setDouble(2, totalMarks);
            numberOfRowsAffected = preparedStatement.executeUpdate();
        }
        return numberOfRowsAffected > 0;
    }
}
