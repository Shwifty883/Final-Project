<%--
  Created by IntelliJ IDEA.
  User: Boto Kardava
  Date: 12/05/2022
  Time: 11:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="registration.css">
    <title>Registration Page</title>
</head>
<body>
<div class="outside_div">
    <div class="registration_container">
        <form method="get" action="register_page">
            <p style="font-size: 24px; font-family: serif; font-weight: bold; color: green">Fill Up the Registration Form</p>
            <hr>
            <p>Enter Your Username or Email</p>
            <input type="text" name="username_email" placeholder="Username/Email" required><br>
            <p>Choose Your Password</p>
            <input type="password" name="password" placeholder="Password" id="password" required><br>
            <p>Confirm Your Password</p>
            <input type="password" name="confirmPassword" placeholder="Confirm Password" id="confirm_password" required><br>
            <p>Enter Your Name</p>
            <input type="text" name="name" placeholder="Name" required><br>
            <p>Enter Your Surname</p>
            <input type="text" name="surname" placeholder="Surname" required><br>
            <p>Enter Your Profession</p>
            <input type="text" name="profession" placeholder="Profession"><br><br>
            <input type="submit" name="register" value="Register" id="submit"><br><br>
            <hr>
            <p>If you are already Registered<br>
                <a href="login.jsp">Log In Here</a></p>
        </form>
    </div>
</div>
        <!--Confirm Password Validation-->
        <script src="confirm_password.js"></script>
</body>
</html>
