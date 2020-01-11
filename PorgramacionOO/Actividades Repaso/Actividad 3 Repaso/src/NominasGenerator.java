public class NominasGenerator {

    public NominasGenerator(){}

    public Comisionado calNominaComisionado(Comisionado comisionado){
        int salarioTotal = comisionado.getnVentas() + comisionado.getSueldoBase();
        Nomina nomina = new Nomina(salarioTotal);
        comisionado.setNomina(nomina);
        return comisionado;
    }

    public PorHoras calNominaPorHoras(PorHoras porHoras){
        int salarioTotal = porHoras.getnHorasTrabajadas() * porHoras.getPrecioPorHora();
        Nomina nomina = new Nomina(salarioTotal);
        porHoras.setNomina(nomina);
        return porHoras;
    }

    public Asalariado calNominaAsalariado(Asalariado asalariado){
        Nomina nomina = new Nomina(asalariado.getSueldoFijo());
        asalariado.setNomina(nomina);
        return asalariado;
    }
}
