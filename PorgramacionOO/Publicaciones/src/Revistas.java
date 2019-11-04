public class Revistas extends Publicacion {
    int numEjemplar;

    public Revistas(String codigo, String titulo, int año, int numEjemplar) {
        super(codigo, titulo, año);
        this.numEjemplar = numEjemplar;
    }
}
