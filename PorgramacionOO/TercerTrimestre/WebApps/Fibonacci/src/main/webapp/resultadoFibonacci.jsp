
<%@ page import="java.io.PrintWriter" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Fibonacci</title>
</head>
<body>
<%
    PrintWriter printer = response.getWriter();
    printer.print("La serie seria: " + request.getAttribute("serie"));
%>
</body>
</html>
