<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Log In Page</title>
    <link rel="stylesheet" href="login.css">
</head>
<body>
<div class="outside_div">
    <div class="login_container">
        <form name="login" action="log_in" method="get">
            <p>User Name</p>
            <input type="text" name="loginUserName" required><br>
            <p>Password</p>
            <input type="password" name="password" required><br><br>
            <input type=submit name="Log In" value="Log In" id="submit"><br><br>
            <hr>
            <p id="registration_text">If you are not Registered<br>
                <a href="registration.jsp">Register Here</a></p>
        </form>
    </div>
</div>
</body>
</html>