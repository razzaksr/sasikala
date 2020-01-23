<%@ page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Passing Form parameters</title>
</head>
<body>
<form action="calc" method="post">
<input type="number" name="deposit" placeholder="Amount wish to deposit"><br><br>
<input type="number" name="tenor" placeholder="No of Years to deposit"><br><br>
<input type="radio" name="citizen" value="Normal">Normal
<input type="radio" name="citizen" value="Senior">Senior
<input type="submit" value="Calculate">
</form>
</body>
</html>