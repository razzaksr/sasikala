<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listing all speakers</title>
</head>
<body>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="cr"%>
<table border="4" cellspacing="4" cellpadding="4">
<tr><th>Id</th><th>Model</th><th>Features</th><th>Qty</th><th>Price</th></tr>
<cr:forEach var="hai" items="${got }">
<tr>
<td>${hai.num }</td><td>${hai.name }</td><td>${hai.feature }</td>
<td>${hai.qty }</td><td>${hai.price }</td>
<td><ul>
<li><a href="edit?id=${hai.num }">Update</a></li>
<li><a href="delete?id=${hai.num }">Delete</a></li>
</ul></td>
</tr>
</cr:forEach>
</table>
</body>
</html>