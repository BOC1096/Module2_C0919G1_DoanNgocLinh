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
    <title>edit</title>
</head>
<body>
<h1>Edit customer</h1>
<p>
    <c:if test='${requestScope["message"] != null}'>
        <span class="message">${requestScope["message"]}</span>
    </c:if>
</p>
<p>
    <a href="/products">Back to product list</a>
</p>
<form method="post">
    <fieldset>
        <legend>Customer information</legend>
        <table>
            <tr>
                <td>Name: </td>
                <td><input type="text" name="name" id="name" value="${requestScope["product"].getNameProduct()}"></td>
            </tr>
            <tr>
                <td>description: </td>
                <td><input type="text" name="description" id="description" value="${requestScope["product"].getDescriptionProduct()}"></td>
            </tr>
            <tr>
                <td>type: </td>
                <td><input type="text" name="type" id="type" value="${requestScope["product"].getTypeProduct()}"></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Update product"></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
