<%@ page language="java" contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Result Page</title>
</head>
<body>
    <h2>Student Result</h2>
    <%
        // Retrieve input values
        int s1 = Integer.parseInt(request.getParameter("subject1"));
        int s2 = Integer.parseInt(request.getParameter("subject2"));
        int s3 = Integer.parseInt(request.getParameter("subject3"));

        // Calculate total and average
        int total = s1 + s2 + s3;
        double average = total / 3.0;

        // Grade Calculation Method
        String grade;
        if (average >= 90) grade = "A";
        else if (average >= 80) grade = "B";
        else if (average >= 70) grade = "C";
        else if (average >= 60) grade = "D";
        else grade = "Fail";
    %>

    <table border="1">
        <tr><th>Total Marks</th><td><%= total %></td></tr>
        <tr><th>Average Marks</th><td><%= average %></td></tr>
        <tr><th>Grade</th><td><%= grade %></td></tr>
    </table>
</body>
</html>
