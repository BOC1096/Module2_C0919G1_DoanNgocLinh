<%--
  Created by IntelliJ IDEA.
  User: TechCare
  Date: 11/17/2019
  Time: 9:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p>
    <a href="/products">Back to product list</a>
</p>
<table>
<tr>
    <td>Name</td>
    <td>Description</td>
    <td>Type</td>
</tr>
<c:forEach items='${requestScope["products"]}' var="product">
    <tr>
        <td>${product.getNameProduct()}</td>
        <td>${product.getDescriptionProduct()}</td>
        <td>${product.getTypeProduct()}</td>
    </tr>
</c:forEach>
</table>
</body>
</html>
