<%@ page import="java.sql.*" %>
<%@ page import="com.google.gson.*" %>


<%
    //Recepción de parámetros
    String accion = request.getParameter("accion");
    String str = request.getParameter("str");
    String name = request.getParameter("name");
    String apellidos = request.getParameter("apellidos");
    String date = request.getParameter("date");
    String pk = request.getParameter("id");
    String result = "";
    int items = 0;
    String html = "<table class='table table-striped table-dark' id = 'myTable'>" +
            "  <thead>" +
            "    <tr>" +
            "      <th scope='col'>Id</th>" +
            "      <th scope='col'>Nombre</th>" +
            "      <th scope='col'>Apellidos</th>" +
            "      <th scope='col'>Fecha nacimiento</th>" +
            "      <th scope='col'>Edit</th>" +
            "      <th scope='col'>Remove</th>" +
            "    </tr>" +
            "  </thead><tbody>";

    //Conexión a la base de datos
    try {
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://vps456458.ovh.net:3306/INMOLOSA?useUnicode=yes&characterEncoding=UTF-8";
        String usuario = "remoto";
        String clave = "malagaserade2Bproximamente";
        Class.forName(driver);
        Connection conexion = DriverManager.getConnection(url, usuario, clave);
        Statement stmt = conexion.createStatement();
        if (accion.equals("read")) {
            ResultSet rs = stmt.executeQuery("SELECT ID_EMPLEADO,NOMBRE,APELLIDOS,FECHA_NACIMIENTO FROM EMPLEADOS WHERE NOMBRE LIKE '%" + str + "%'");
            while (rs.next()) {
                items++;
                html += "<tr id = '"+ rs.getString("ID_EMPLEADO")+"'>" +
                        "<td class = 'id' id='empleado_"+items+"_id'>" + rs.getString("ID_EMPLEADO") + "</td>";
                html += "<td id='empleado_"+items+"_nombre'>" + rs.getString("NOMBRE") + "</td>";
                html += "<td id='empleado_"+items+"_apellidos'>" + rs.getString("APELLIDOS") + "</td>";
                html += "<td id='empleado_"+items+"_nacimiento'>" + rs.getString("FECHA_NACIMIENTO") + "</td>";
                html += "<td><button type='button'  data-toggle='modal' data-target='#editModal' onclick = 'recogervalor(" +items+")'" + "'><i class='fas fa-user-edit'></i> </button></td>";
                html += "<td><button type='button' class='btnRemove' onclick= 'Remove(" + rs.getString("ID_EMPLEADO") + ")'><i class='fas fa-trash-alt'></i> </button></td></tr>";

            }
        }
        if (accion.equals("add")){
            stmt.executeUpdate("INSERT INTO EMPLEADOS (NOMBRE,APELLIDOS,FECHA_NACIMIENTO) VALUES ('" + name + "','" + apellidos + "', '" + date + "')");
        }
        if (accion.equals("delete")){
            stmt.executeUpdate("DELETE FROM EMPLEADOS WHERE ID_EMPLEADO = " + pk);
        }
        if (accion.equals("update")){
            stmt.executeUpdate("UPDATE EMPLEADOS SET NOMBRE =\'"+ name +"\', APELLIDOS =\'"+ apellidos +"\', FECHA_NACIMIENTO = \'"+ date +"\' WHERE ID_EMPLEADO=" + pk);
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