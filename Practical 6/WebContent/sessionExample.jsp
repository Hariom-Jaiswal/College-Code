<%@ page language="java" contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Session Example</title>
</head>
<body>
    <%
        // Retrieve session object
        HttpSession sessionObj = request.getSession();
        Integer visitCount = (Integer) sessionObj.getAttribute("visitCount");

        if (visitCount == null) {
            visitCount = 1;
            out.println("<h2>Welcome, New User!</h2>");
        } else {
            visitCount++;
            out.println("<h2>Welcome Back!</h2>");
        }
        
        sessionObj.setAttribute("visitCount", visitCount);
    %>
    <p>You have visited this page <%= visitCount %> times.</p>
</body>
</html>
