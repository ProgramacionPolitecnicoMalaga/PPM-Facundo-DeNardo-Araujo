public class MiMain {
    public static void main(String[] args) {
        AnalizadorTexto an = new AnalizadorTexto();

        an.analizartexto("texto.csv");
        an.mostrarPalabrasFiltradas();
    }
}
