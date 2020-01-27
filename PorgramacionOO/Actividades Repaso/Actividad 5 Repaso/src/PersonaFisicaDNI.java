public class PersonaFisicaDNI extends Comprador {
    String NombreApellidos;
    String dni;
    String direccion;

    public PersonaFisicaDNI(String nombreApellidos, String dni, String direccion) {
        NombreApellidos = nombreApellidos;
        this.dni = dni;
        this.direccion = direccion;
    }
}
