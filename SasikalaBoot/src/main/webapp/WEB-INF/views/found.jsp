<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Found</title>
</head>
<body>
<form action="update" method="post">
<input type="text" name="num" value="${one.num }"><br><br>
<input type="text" name="name" value="${one.name }"><br><br>
<input type="text" name="feature" value="${one.feature }"><br><br>
<input type="text" name="qty" value="${one.qty }"><br><br>
<input type="text" name="price" value="${one.price }"><br><br>
<input type="submit" value="Update"><input type="reset" value="Clear">
</form>
</body>
</html>