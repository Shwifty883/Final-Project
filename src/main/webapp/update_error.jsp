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
        <h2>Hey ${firstName} ${lastName}</h2>
        <p style="color: black">❌ Your Information Has Not Been Updated, Please Try Again!</p>
        <form action="login.jsp">
            <input type="submit" value="Log Out" id="logout">
        </form>
    </div>
</div>
</body>
</html>
