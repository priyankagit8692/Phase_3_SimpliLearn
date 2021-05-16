<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>Register</title>
</head>
<style>
body  {
 
  background-color: #E8ADAA;
}
</style>
<h1 align="center"><u>Registration Page</u>	</h1>
<br><br><br>
<form method="post">
    <table align="center" style="border-spacing: 15px">
  		 <a href="home"><p style="text-align:center"><font size=5"><i>Home</i></font></p></a>
        <tr>
            <td>Email:</td>
            <td><input type="email" name="email" ></td>
        </tr>
        <tr>
            <td>Password:</td>
            <td><input type="password" name="password" ></td>
        </tr>
        <tr>
            <td>Name:</td>
            <td><input type="text" name="name" ></td>
        </tr>
        <tr>
            <td>Address:</td>
            <td><input type="text" name="address" ></td>
        </tr>
        <tr>
            <td>Phone:</td>
            <td><input type="number" name="phone" ></td>
        </tr>
        <tr>
           
            <td>
                <button type="submit">submit</button>
            </td>
        </tr>
        
    </table>
</form>
</html>