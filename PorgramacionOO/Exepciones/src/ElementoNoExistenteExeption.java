public class ElementoNoExistenteExeption extends Exception {
    public ElementoNoExistenteExeption(String message, int longitudMaxima){
        super(message);
        System.out.println("La longitud maxima es " + longitudMaxima);
    }

}
