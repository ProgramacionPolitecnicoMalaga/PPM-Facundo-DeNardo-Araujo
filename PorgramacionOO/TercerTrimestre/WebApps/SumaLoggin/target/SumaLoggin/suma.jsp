
<%@ page import="java.io.PrintWriter" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Suma</title>
</head>
<body>
<%
    PrintWriter printer = response.getWriter();
    printer.print("El resultado es: " + request.getAttribute("resultado"));
%>
</body>
</html>
