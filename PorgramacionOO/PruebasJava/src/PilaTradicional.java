public class PilaTradicional implements SecuenciaDeDatos {
    Persona[] cola;
    int head;


    public PilaTradicional(int tamaño){
        cola = new Persona[tamaño];
    }

    @Override
    public void insertar(Persona persona) {
    if (head<cola.length) {
        head++;
        cola[head] = persona;
        }
    }

    @Override
    public Persona extraer() {
        Persona persona = null;
        if (head>= 0){
            persona = cola[head];
            head--;
        }
        return persona;
    }
}
