public class GeneradorDatosTemperatura implements FuenteDeTemperaturas {

    private double ultimaTemperaturaRegistrada;
    private int ultimaHoraRegistrada;
    private GeneradorDatosTemperatura[] consumidores;
    private final static int MAX_CONSUMIDORES = 100;
    private int numeroConsumidores;



   public GeneradorDatosTemperatura(){
       numeroConsumidores = 0;
       consumidores = new ConsumidorDeTemperaturas[MAX_CONSUMIDORES]
   }
    @Override
    public void registrarConsumidor(ConsumidorDeTemperaturas consumidor) {
       consumidores[numeroConsumidores] = consumidor;

    }

    @Override
    public void informarAConsumidores() {
        for (int i = 0; i<numeroConsumidores; i++){
            consumidores[i].
        }
    }
    public void setNuevaLecturaTemperatura(double temperatura, int hora){
        this.ultimaHoraRegistrada = hora;
        informarAConsumidores();
    }


}