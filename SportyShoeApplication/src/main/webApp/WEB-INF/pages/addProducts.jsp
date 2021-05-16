<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Products</title>
</head>

<style>
body  {
 
  background-color: #99C68E;
}
</style>
<h1 align="center">Add Product</h1>
<br>
<center><a href="adminHome"><button style="width:110px;">Home</button></a></center><br><br><br>
<form method="post">
	<table align="center" style="border-spacing: 10px">
	<tr>
		<td>Product Name</td>
		<td><input type="text" name="name" required></td>
	</tr>
	<tr>
		<td>Brand</td>
		<td><input type="text" name="brand" required></td>
	</tr>
	<tr>
		<td>Manufacturing Location</td>
		<td><input type="text" name="mLocation" required></td>
	</tr>
	<tr>
		<td>Price</td>
		<td><input type="number" name="price" required></td>
	</tr>
	<tr>
		<td>Date</td>
		<td><input type="date" name="date" required></td>
	</tr>
	<td>
                <button type="submit">submit</button>
            </td>
	</table>

</form>
</html>