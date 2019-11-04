public class Habitacion {
    public static final int SIMPLE = 60;
    public static final int DOBLE = 90;
    public static final int SUITE = 240;
    boolean Libre_Ocupada;
    Huesped huesped;

    public Habitacion(int tipoDeHabitacion){
        Libre_Ocupada = false;
    }

    public boolean isLibre_Ocupada() {
        if (Libre_Ocupada == false){
            System.out.println("Habitacion Libre");
        }else {
            System.out.println("Habitacion ocupada");
        }
        return Libre_Ocupada;
    }

    public void setOcuparHabitacion() {
        Libre_Ocupada = true;
    }





}
