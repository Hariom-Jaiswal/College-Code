<%@ page language="java" contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Student Marks Entry</title>
</head>
<body>
    <h2>Enter Student Marks</h2>
    <form action="process.jsp" method="post">
        Subject 1: <input type="text" name="subject1"><br>
        Subject 2: <input type="text" name="subject2"><br>
        Subject 3: <input type="text" name="subject3"><br>
        <input type="submit" value="Calculate">
    </form>
</body>
</html>
