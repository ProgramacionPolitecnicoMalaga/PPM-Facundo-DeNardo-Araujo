<%@ page import="java.sql.*" %>
<%@ page import="com.google.gson.*" %>


<%
    //Recepción de parámetros
    String accion = request.getParameter("accion");
    String str = request.getParameter("str");
    String nick = request.getParameter("nick");
    String nomape = request.getParameter("nomape");
    String correo = request.getParameter("correo");
    String pk = request.getParameter("id");
    String result = "";
    int items = 0;
    String html = "<table class='table table-striped table-dark' id = 'myTable'>" +
            "  <thead>" +
            "    <tr>" +
            "      <th scope='col'>NICK</th>" +
            "      <th scope='col'>NOMBRE Y APELLIDO</th>" +
            "      <th scope='col'>CORREO</th>" +
            "    </tr>" +
            "  </thead><tbody>";

    //Conexión a la base de datos
    try {
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://vps456458.ovh.net:3306/LOGINS?useUnicode=yes&characterEncoding=UTF-8";
        String usuario = "remoto";
        String clave = "malagaserade2Bproximamente";
        Class.forName(driver);
        Connection conexion = DriverManager.getConnection(url, usuario, clave);
        Statement stmt = conexion.createStatement();
        if (accion.equals("read")) {
            ResultSet rs = stmt.executeQuery("SELECT ID,NICK, NOMAPE, CORREO FROM USUARIOS WHERE NICK LIKE '%" + str + "%'");
            while (rs.next()) {
                items++;
                html += "<tr>" +
                        "<td class = 'id' id='usu"+items+"_id'>" + rs.getString("ID") + "</td>"+
                        "<td class = 'id' id='usu"+items+"_nick'>" + rs.getString("NICK") + "</td>";
                html += "<td id='usu_"+items+"_nomape'>" + rs.getString("NOMAPE") + "</td>";
                html += "<td id='usu_"+items+"_correo'>" + rs.getString("CORREO") + "</td>";
            }
        }
        if (accion.equals("insert")){
            stmt.executeUpdate("INSERT INTO USUARIOS (NICK,NOMAPE,CORREO) VALUES ('" + nick + "','" + nomape + "', '" + correo + "')");
        }

        html += "</tbody></table>";
        result = "{\"status\":\"ok\",\"html\" : \"" + html + "\",\"items\":" + items + "}";

    } catch (Exception ex) {
        result = "{\"status\":\"ko\",\"mensaje\" : \"" + ex.toString() + "\"}";
    }

    //Generación de la salida
    String json = new Gson().toJson(result);
    response.setContentType("application/json");
    response.setCharacterEncoding("UTF-8");
    response.getWriter().write(json);
%>