public class DiarioDeTemperaturas implements ConsumidorDeTemperaturas {
   private double temperaturasPorHoras[];

   public DiarioDeTemperaturas(){
       temperaturasPorHoras = new double[24];
   }

    @Override
    public void setNuevaLecturaTemperatura(double temperatura, int hora) {
        temperaturasPorHoras[hora] = temperatura;
    }

    @Override
    public String toString() {
       String cadena = "";
        for (int i = 0; i< temperaturasPorHoras.length; i++){
            cadena += i + "(" +  temperaturasPorHoras[i] + ")" + "-";
        }
        return cadena;
    }
}
