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

    public boolean deleteStudentData(Connection connection, int rollNumber) throws SQLException {

        String deleteQuery = "DELETE FROM `school`.`student` WHERE (`roll_number` = ?);";
        int numberOfRowsAffected;
        try (PreparedStatement preparedStatement = connection.prepareStatement(deleteQuery)) {
            preparedStatement.setInt(1, rollNumber);
            numberOfRowsAffected = preparedStatement.executeUpdate();
        }
        return numberOfRowsAffected > 0;
    }
    public boolean updateStudentData(Connection connection, int updateRollNumber, double totalMarks) throws SQLException {
        String updateQuery = "UPDATE `school`.`student` set `roll_number` = '15' where (`roll_number` = '16');";
        int numberOfRowsAffected;
        try (PreparedStatement preparedStatement = connection.prepareStatement(updateQuery)) {
            preparedStatement.setInt(1, updateRollNumber);
            preparedStatement.setDouble(2, totalMarks);
            numberOfRowsAffected = preparedStatement.executeUpdate();
        }
        return numberOfRowsAffected > 0;
    }
}
