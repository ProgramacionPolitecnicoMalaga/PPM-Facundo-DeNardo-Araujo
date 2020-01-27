public class PersonaJuridica extends Comprador {
    String nombre;
    String cif;
    String razonSocial;

    public PersonaJuridica(String nombre, String cif, String razonSocial) {
        this.nombre = nombre;
        this.cif = cif;
        this.razonSocial = razonSocial;
    }
}
