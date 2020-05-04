import DAO.LectorENV;
import Viewers.DataViewer;
import Viewers.ViewerFactory;

public class Prueba {
    public static void main(String[] args) {
        LectorENV lectorENV = new LectorENV();
        ViewerFactory viewerFactory = new ViewerFactory();

        String tipoDeFormato = lectorENV.getDataType();

        DataViewer dataViewer = viewerFactory.crearViewer(tipoDeFormato);

        System.out.println(dataViewer.mostrarContenido());
    }
}
