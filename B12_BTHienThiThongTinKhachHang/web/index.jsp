<%--
  Created by IntelliJ IDEA.
  User: TechCare
  Date: 11/12/2019
  Time: 3:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Danh Sach Khach Hang</title>
</head>
<body>
<div align="center">
    <table border="1" cellpadding="5">
        <caption><h2>List Of Customer</h2></caption>
        <tr>
            <th>Name</th>
            <th>Birthday</th>
            <th>Address</th>
        </tr>

        //hien thi danh sach customer

        <c:forEach var="customer" items="${listCustomer}">
            <tr>
                <td><c:out value="${customer.getName()}"></c:out></td>
                <td><c:out value="${customer.getBirthday()}"></c:out></td>
                <td><c:out value="${customer.getAddress()}"></c:out></td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
