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

}
