<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Stock</title>
</head>
<body>
<%@taglib prefix="fm" uri="http://www.springframework.org/tags/form" %>
<fm:errors path="bike.*"></fm:errors>
<form action="insert" method="post">
<input type="text" name="bid" placeholder="Enter Bike ID"><br><br>
<input type="text" name="model" placeholder="Enter Bike Model"><br><br>
<input type="date" name="manufactured" placeholder="Enter Bike DOM dd.MM.yyyy"><br><br>
<input type="text" name="milage" placeholder="Enter Bike Avg Economy"><br><br>
<input type="number" name="price" placeholder="Enter Bike Cost"><br><br>
<input type="submit" value="Add Stock">
</form>
</body>
</html>