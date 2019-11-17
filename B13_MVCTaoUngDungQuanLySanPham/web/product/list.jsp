<%--
  Created by IntelliJ IDEA.
  User: TechCare
  Date: 11/17/2019
  Time: 7:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>list</title>
</head>
<body>
<h1>Product</h1>
<p>
    <a href="/products?action=create">Create new product</a>
</p>
<p>
    <a href="/products?action=search">Search product</a>
</p>
<table border="1">
    <tr>
        <td>Name</td>
        <td>Description</td>
        <td>Type</td>
    </tr>
    <c:forEach items='${requestScope["products"]}' var="product">
        <tr>
            <td><a href="/products?action=view&id=${product.getIdProduct()}">${product.getNameProduct()}</a></td>
            <td>${product.getDescriptionProduct()}</td>
            <td>${product.getTypeProduct()}</td>
            <td><a href="/products?action=edit&id=${product.getIdProduct()}">edit</a></td>
            <td><a href="/products?action=delete&id=${product.getIdProduct()}">delete</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
