<%@ page import="java.util.*" %>
<%@ page import="java.io.PrintWriter" %>
<%--
  Created by IntelliJ IDEA.
  User: mauri
  Date: 19/4/20
  Time: 23:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Cervezas</title>
</head>
<body>
<%
    PrintWriter printer = response.getWriter();
    printer.print("La opción es " + request.getParameter("color"));
    List<String> cervezas = (List) request.getAttribute("lista_cervezas");
    for (String cerveza: cervezas){
        printer.print("<br>prueba " + cerveza);
    }
%>
</body>
</html>