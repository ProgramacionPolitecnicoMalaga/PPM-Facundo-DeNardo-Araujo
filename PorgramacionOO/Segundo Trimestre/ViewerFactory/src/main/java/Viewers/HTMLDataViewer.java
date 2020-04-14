package Viewers;

import DAO.LectorXML;
import Modelo.PoblacionPorNacionalidad;

import java.util.ArrayList;

public class HTMLDataViewer implements DataViewer {
    private LectorXML lector = new LectorXML();



    @Override
    public String mostrarContenido() {
        ArrayList<PoblacionPorNacionalidad> lista = lector.cargarXML();
        String aMostrar = "<table>\n<tr>\n<th>Nacionalidad</th><th>Año</th><th>Total</th>\n</tr>";
        for (PoblacionPorNacionalidad p : lista)
            aMostrar += "\n<tr>\n<th>"+p.getNacionalidad()+"</th><th>"+p.getAño()+"</th><th>"+p.getAño()+"</th>\n</tr>";
        return aMostrar;
    }
}
