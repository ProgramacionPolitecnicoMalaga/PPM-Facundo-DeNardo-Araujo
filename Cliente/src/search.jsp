<%@ page import="java.sql.*" %>
<%@ page import="com.google.gson.*" %>
<%@ page import="java.util.ArrayList" %>


<%
    //Recepción de parámetros
    String accion = request.getParameter("accion");
    String result = "";
    String html = "";

    //Conexión a la base de datos
    try {
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://vps456458.ovh.net:3306/LOGINS?useUnicode=yes&characterEncoding=UTF-8";
        String usuario = "remoto";
        String clave = "malagaserade2Bproximamente";
        Class.forName(driver);
        Connection conexion = DriverManager.getConnection(url, usuario, clave);
        Statement stmt = conexion.createStatement();
        if (accion.equals("auto")) {
            ResultSet rs = stmt.executeQuery("SELECT * FROM USUARIOS");
            while (rs.next()) {
                html += rs.getString("NOMAPE") + ",";
            }
        }
        result = "{\"status\":\"ok\",\"html\" : \"" + html + "\"}";

    } catch (Exception ex) {
        result = "{\"status\":\"ko\",\"mensaje\" : \"" + ex.toString() + "\"}";
    }

    //Generación de la salida
    String json = new Gson().toJson(result);
    response.setContentType("application/json");
    response.setCharacterEncoding("UTF-8");
    response.getWriter().write(json);
%>