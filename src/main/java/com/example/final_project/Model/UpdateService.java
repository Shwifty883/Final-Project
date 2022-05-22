//package com.example.final_project.Model;
//
//import java.sql.*;
//import java.util.ArrayList;
//import java.util.List;
//
//public class UpdateService {
//    public void Update(String pass, String prof, String oldUserName) {

//        Connection connection = null;//
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            Connection myConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "B)to123");
//
//            String updateQuery = "update user_information set password = " + pass + ", " +
//                    "profession = " + prof + ", " +
//                    "where userName = " + oldUserName + "";
//
//            PreparedStatement ps = myConnection.prepareStatement(updateQuery);
//            ps.executeUpdate();
//
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        } finally {
//            try {
//                if (connection != null) {
//                    connection.close();
//                }
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}
