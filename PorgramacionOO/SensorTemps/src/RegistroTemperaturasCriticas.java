public class RegistroTemperaturasCriticas implements ConsumidorDeTemperaturas {
    private double[] temperaturasCriticas;
    private final static int UMBRAL = 110;

    private RegistroTemperaturasCriticas(){
        temperaturasCriticas = new double[24];
        for (int i = 0; i< temperaturasCriticas.length; i++){
            temperaturasCriticas[i] = 0;
        }
    }

    @Override
    public void setNuevaLecturaTemperatura(double temperatura, int hora) {
        if (temperatura > UMBRAL){
            temperaturasCriticas[hora]++;
        }
    }

    @Override
    public String toString() {
        String textoTemperaturasCriticas = "";
        for (int i = 0; i < temperaturasCriticas.length; i++){
            textoTemperaturasCriticas += i + "(" + temperaturasCriticas[i] + ")" + "-";
        }
        return textoTemperaturasCriticas;
    }
}
