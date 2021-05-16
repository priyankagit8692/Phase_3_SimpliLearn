<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>User home</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<style>
body  {
 
  background-color: #99C68E;
}
</style>
<body>
<h1 align="center">Welcome to Sporty Shoes ${name} User</h1><br>

<center>
    <a href="home"><button style="width: 110px;">Logout</button></a></center><br><br>

<div class="container">
    <table class="table table-striped">
        <thead>
        <tr>
            <th>Product ID</th>
            <th>Product Name</th>
            <th>Brand</th>
            <th>Manufacturing Location</th>
            <th>Price</th>
            <th>Purchase Date</th>
            <th></th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${products}" var="product">
            <tr>
                <td>${product.id}</td>
                <td>${product.productName}</td>
                <td>${product.brand}</td>
                <td>${product.mLocation}</td>
                <td>${product.price}</td>
                <td>${product.purchaseDate}</td>
                <td><a type="button" class="btn btn-success"
                       href="/mainApp/buy?id=${product.id}">Buy</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<%--<script src="webjars/jquery/1.9.1/jquery.min.js"></script>--%>
<%--<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>--%>
</body>
</html>