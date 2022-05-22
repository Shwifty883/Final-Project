package com.example.final_project.Controler;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "login", value = "/log_in")
public class login extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String userName = request.getParameter("loginUserName");
        String password = request.getParameter("password");

        Map<String, String> checkLogin = new HashMap<>();

        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection myConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "B)to123");

            PreparedStatement ps = myConnection.prepareStatement("select * from user_information");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                String name = rs.getString("userName");
                String pass = rs.getString("password");
                String firstName = rs.getString("name");
                String surname = rs.getString("surname");

                if (name.equals(userName)) {
                    request.setAttribute("firstName", firstName);
                    request.setAttribute("lastName", surname);
                    request.setAttribute("userName", name);
                }
                checkLogin.put(name, pass);
            }

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

        if (checkLogin.containsKey(userName) && checkLogin.containsValue(password)) {
            getServletContext().getRequestDispatcher("/userPage.jsp").forward(request, response);
        } else {
            getServletContext().getRequestDispatcher("/login_error.jsp").forward(request, response);
        }
    }
}
