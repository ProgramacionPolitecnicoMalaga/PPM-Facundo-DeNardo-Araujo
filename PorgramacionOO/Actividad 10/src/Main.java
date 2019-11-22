public class Main {
    public static void main(String[] args) {
        Publicacion[] baseDatosPublicacion = new Publicacion[10];
        baseDatosPublicacion[0] = new Revistas("1212","Revista 1",1222,12);
        baseDatosPublicacion[1] = new Revistas("3434","Revista 2", 1920,11);
        baseDatosPublicacion[2] = new Libros("5676", "Libro 1", 1923);
        baseDatosPublicacion[3] = new Libros("6767","Libro 2", 1969);

        System.out.println(baseDatosPublicacion[0]);
    }
}
