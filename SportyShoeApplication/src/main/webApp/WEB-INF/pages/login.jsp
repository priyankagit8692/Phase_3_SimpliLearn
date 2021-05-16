<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>Login Page</title>
</head>
<style>
body  {
 
  background-color: #E8ADAA;
}
</style>
<h1 align="center"><i>Login</i></h1><br>
<font color="green"> <h4 align="center">${logout}</h4></font>
<font color="red"> <h4 align="center">${message}</h4></font>
<form method="post">
    <table align="center" style="border-spacing: 15px">
    <a href="home"><p style="text-align:center"><font size="4"><i>Home</i></font></p></a>
        <tr>
            <td>Email:</td>
            <td><input type="email" name="email" required></td>
        </tr>
        <tr>
            <td>Password:</td>
            <td><input type="password" name="password" required></td>
        </tr>
        <tr>
            <td><input type="submit"></td>
        </tr>

    </table>
</form>
</html>