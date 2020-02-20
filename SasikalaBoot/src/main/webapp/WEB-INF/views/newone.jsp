<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add new Speaker</title>
</head>
<body>
${msg }
<form action="added" method="post">
<input type="text" name="name" placeholder="Speaker model"><br>
<input type="text" name="feature" placeholder="Speaker Feature"><br>
<input type="text" name="qty" placeholder="Speaker Qty "><br>
<input type="text" name="price" placeholder="Speaker price"><br>
<input type="submit" value="Enroll"><input type="reset" value="Clear">
</form>
</body>
</html>