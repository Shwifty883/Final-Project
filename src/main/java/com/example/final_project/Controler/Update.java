package com.example.final_project.Controler;

//import com.example.final_project.Model.UpdateService;
import com.example.final_project.Model.UserClass;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/Update")
public class Update extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String existingUser = request.getParameter("existingUserName");
//        String loginUser = request.getParameter("loginUserName");
//        String registerUser = request.getParameter("username_email");
        //String user = request.getParameter("username");
        String pass = request.getParameter("password");
        String prof = request.getParameter("profession");


        //List<String> allUsers = new ArrayList<>();

        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection myConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "B)to123");

            String updateQuery = "update user_information set password =?, " +
                    "profession =?, " +
                    "where userName = " + existingUser + "";

            PreparedStatement ps = myConnection.prepareStatement(updateQuery);
            ps.setString(4, pass);
            ps.setString(5, prof);
//            PreparedStatement ps2 = myConnection.prepareStatement("select * from user_information");
//            ResultSet rs = ps2.executeQuery();
            ps.executeUpdate();

//            while (rs.next()) {
//                String users = rs.getString("userName");
//                allUsers.add(users);
//            }

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

        if (existingUser != null) {
            getServletContext().getRequestDispatcher("/updated_user.jsp").forward(request, response);
        } else {
            getServletContext().getRequestDispatcher("/update_error.jsp").forward(request, response);
        }
    }
}
