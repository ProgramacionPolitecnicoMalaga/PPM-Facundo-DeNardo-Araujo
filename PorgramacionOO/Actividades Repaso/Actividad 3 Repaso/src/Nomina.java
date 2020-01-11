public class Nomina {
    int SalaraioTotal;

    public Nomina(int SalarioTotal){
        this.SalaraioTotal = SalarioTotal;
    }

    @Override
    public String toString() {
        return "Nomina: " + SalaraioTotal;
    }
}
