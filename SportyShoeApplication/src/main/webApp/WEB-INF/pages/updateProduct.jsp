<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Product</title>
</head>

<style>
body  {
 
  background-color: #FFF380;
}
</style>
<h1 align="center">Update Product</h1>
<br>
<center><a href="adminHome"><button style="width: 110px;">User Home</button></a></center><br><br>
<form method="post">
	<table align="center" style="border-spacing: 10px">
	<tr>
		<td>Product Name</td>
		<td><input type="text" name="name" value="${product.productName}"></td>
	</tr>
	<tr>
		<td>Brand</td>
		<td><input type="text" name="brand" value="${product.brand}"></td>
	</tr>
	<tr>
		<td>Manufacturing Location</td>
		<td><input type="text" name="mLocation" value="${product.mLocation}"></td>
	</tr>
	<tr>
		<td>Price</td>
		<td><input type="number" name="price" value="${product.price}"></td>
	</tr>
	<tr>
		<td>Date</td>
		<td><input type="date" name="date" value="${product.purchaseDate}"></td>
	</tr>
	<td>
                <button type="submit">submit</button>
            </td>
	</table>

</form>

</html>