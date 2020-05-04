import java.sql.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in).useDelimiter("\n");
        String db = "Empelados";
        String url  = "jdbc:mysql://51.77.146.122:3306/" + db;
        String usuario ="empleadosuser";
        String password = "12345678910";
        try {
            Connection dbConn = DriverManager.getConnection(url,usuario,password);
            ResultSet rs =  dbConn.prepareStatement("SELECT * FROM Empleado").executeQuery();
            while (rs.next()){
                System.out.println(rs.getString("nombre"));
            }
            System.out.println("Di un nombre : ");
            String nombre = sc.next();
            dbConn.prepareStatement("INSERT INTO Empleado(nombre) VALUE ('" + nombre + "')").executeUpdate();

            System.out.println("Di un nombre para borrar: ");
            nombre = sc.next();
            dbConn.prepareStatement("DELETE FROM Empleado WHERE nombre = '" + nombre + "'").executeUpdate();

            /*System.out.println("Granada de mano: ");
            int numFilas = dbConn.prepareStatement("DELETE FROM Empleado").executeUpdate();
            System.out.println(numFilas);*/

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
