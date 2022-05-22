<%--
  Created by IntelliJ IDEA.
  User: Boto Kardava
  Date: 12/05/2022
  Time: 23:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="login.css">
    <title>Log In Error</title>
</head>
<body>
<div class="outside_div">
    <div class="login_container">
        <form name="login" action="" method="get" id="login_form">
            <div style="border: 2px solid red; border-radius: 5px; padding: 10px">
                <p>Username/Email or Password is incorrect,<br>
                    Or You are not Registered yet</p>
            </div>
            <p>User Name</p>
            <input type="text" name="userName" required><br>
            <p>Password</p>
            <input type="password" name="password" required><br><br>
            <input style="text-align: center" type=submit name="Log In" value="Log In" id="submit"><br><br>
            <hr>
            <p id="registration_text">If you are not Registered<br>
                <a href="registration.jsp">Register Here</a></p>
        </form>
    </div>
</div>
</body>
</html>
