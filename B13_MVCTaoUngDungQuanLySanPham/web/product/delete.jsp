<%--
  Created by IntelliJ IDEA.
  User: TechCare
  Date: 11/17/2019
  Time: 7:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>DELETE</title>
</head>
<body>
<h1>Delete customer</h1>
<p>
    <a href="/products">Back to product list</a>
</p>
<form method="post">
    <h3>Are you sure?</h3>
    <fieldset>
        <legend>Product information</legend>
        <table>
            <tr>
                <td>Name:</td>
                <td>${requestScope["product"].getNameProduct()}</td>
            </tr>
            <tr>
                <td>Description:</td>
                <td>${requestScope["product"].getDescriptionProduct()}</td>
            </tr>
            <tr>
                <td>Type:</td>
                <td>${requestScope["product"].getTypeProduct()}</td>
            </tr>
            <tr>
                <td><input type="submit" value="Delete product"></td>
                <td><a href="/products">Back to Product list</a></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
