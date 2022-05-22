package com.example.final_project.Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegistrationService {
    public void registration(String firstname, String lastName, String userName, String password, String profession) {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection myConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "B)to123");

            PreparedStatement ps = myConnection.prepareStatement("INSERT INTO user_information(name, surname, userName, password, profession) " + " values (?, ?, ?, ?, ?)");
            ps.setString(1, firstname);
            ps.setString(2, lastName);
            ps.setString(3, userName);
            ps.setString(4, password);
            ps.setString(5, profession);
            ps.execute();

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
