package Viewers;

import DAO.LectorXML;
import Modelo.PoblacionPorNacionalidad;

import java.util.ArrayList;

public class TextDataViewer implements DataViewer {
    private LectorXML lector = new LectorXML();

    @Override
    public String mostrarContenido() {
        ArrayList<PoblacionPorNacionalidad> lista = lector.cargarXML();
        String aMostrar = "";
        for (PoblacionPorNacionalidad p : lista)
            aMostrar += "El total de empadronados en " + p.getAño() + " procedentes de " + p.getNacionalidad() + " fue de " + p.getNumeroEmpadronados() + " personas.\n";
        return aMostrar;
    }
}
