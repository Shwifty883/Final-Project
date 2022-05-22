<%--
  Created by IntelliJ IDEA.
  User: Boto Kardava
  Date: 18/05/2022
  Time: 00:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="userPage.css">
    <title>User Page</title>
</head>
<body>
<div class="welcome_user_outside">
    <div class="welcome_user">
        <h2>Welcome, ${firstName} ${lastName}</h2>
        <p style="color: black">You Can Update Your Information Here</p>
    </div>
    <div class="input">
        <form action="Update" method="get">
            <input type="hidden" value="${loginUserName}" name="loginUserName">
            <input type="hidden" value="${username_email}" name="username_email">
            <p style="color: black">First Name</p>
            <input type="text" id="fname" name="firstname" placeholder="${firstName}" readonly>
            <p style="color: black">Last Name</p>
            <input type="text" id="lname" name="lastname" placeholder="${lastName}" readonly>
            <p style="color: black">User Name</p>
            <input type="text" id="username" name="username" placeholder="${userName}" readonly>
            <p tyle="color: black">Repeat Your User Name</p>
            <input type="text" id="existingUserName" name="existingUserName" placeholder="" required>
            <p>Change Password Here</p>
            <input type="password" name="password" id="password" required>
            <p>Confirm Password</p>
            <input type="password" name="confirmPassword" id="confirm_password" required>
            <p>Change Profession Here</p>
            <input type="text" name="profession" placeholder="" required><br><br>
            <input type="submit" value="Update" id="submit">
        </form>
        <form action="login.jsp" method="get">
            <input type="submit" value="Log Out" id="logout">
        </form>
    </div>
</div>
</div>
        <!--Confirm Password Validation-->
        <script src="confirm_password.js"></script>
</body>
</html>
