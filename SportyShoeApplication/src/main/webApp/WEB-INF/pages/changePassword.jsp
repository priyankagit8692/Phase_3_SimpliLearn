<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Change Password</title>
</head>
<style>
body  {
 
  background-color: #FFF380;
}
</style>

<h1 align="center">Update your Password</h1>
<br>
<center><a href="adminHome"><button style="width:110px;"> Admin Home</button></a></center><br><br><br>
<h4 align="center">${message}</h4><br>
 <form method="post">
    <table align="center" style="border-spacing: 15px">
  		 
        <tr>
            <td>Current password</td>
            <td><input type="text" name="cPassword" required></td>
        </tr>
        <tr>
            <td>New Password:</td>
            <td><input type="text" name="nPassword" required></td>
        </tr>
        <tr>
            <td>Re-enter Password:</td>
            <td><input type="text" name="rPassword" required></td>
        </tr>
         
            <td>
                <button type="submit">submit</button>
            </td>
        </tr>
        
    </table>
</form>
</html>