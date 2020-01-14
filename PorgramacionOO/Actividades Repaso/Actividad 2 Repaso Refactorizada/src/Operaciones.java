import java.util.ArrayList;
import java.util.HashMap;

public class Operaciones {
    public Operaciones(){}

    public ArrayList coincidenciasDeVenta(int venta, Comerciales comerciales){
        ArrayList<Comercial> comercialesConVentaBuscada = new ArrayList<>();
        for (Comercial comercial : comerciales.getRegistrados())
            if (comercial.haVendido(venta))
                comercialesConVentaBuscada.add(comercial);
        return comercialesConVentaBuscada;
    }

    public Comercial obtenerComConMayorVenta(Comerciales comerciales){
        Comercial comercialComparar = new Comercial("as");
        comercialComparar.addVenta(-1);
        for (Comercial comercial : comerciales.getRegistrados())
            if (comercial.obtenerVentaMaxima() > comercialComparar.obtenerVentaMaxima())
                comercialComparar = comercial;
        return comercialComparar;
    }

    public double promedioComercial(Comercial comercial){
        double promedioVenta = 0;
        for (Integer venta : comercial.getVentas())
            promedioVenta += venta;
        return promedioVenta/comercial.getVentas().size();
    }

    public HashMap obtenerPromediosVenta(Comerciales comerciales){
        HashMap<Comercial,Double> listaPromedios = new HashMap<>();
        for (Comercial comercial:comerciales.getRegistrados()){
            double promedio = promedioComercial(comercial);
            listaPromedios.put(comercial, promedio);
        }
        return listaPromedios;
    }
}
