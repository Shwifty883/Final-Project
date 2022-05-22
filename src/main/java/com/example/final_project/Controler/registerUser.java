package com.example.final_project.Controler;

import com.example.final_project.Model.RegistrationService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet("/register_page")
public class registerUser extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        String userName = req.getParameter("username_email");
        String password = req.getParameter("password");
        String firstname = req.getParameter("name");
        String lastName = req.getParameter("surname");
        String profession = req.getParameter("profession");

        RegistrationService myRegister = new RegistrationService();
        myRegister.registration(firstname, lastName, userName, password, profession);

        req.setAttribute("firstName", firstname);
        req.setAttribute("lastName", lastName);
        req.setAttribute("userName", userName);
        getServletContext().getRequestDispatcher("/userPage.jsp").forward(req, resp);
    }
}
