package Viewers;

public class ViewerFactory {
    public static final String TEXTO = "text";
    public static final String HTML = "html";

    public DataViewer crearViewer(String tipoDeViewer){
        DataViewer dataViewer = null;
        if (tipoDeViewer.equals(ViewerFactory.TEXTO)){
            dataViewer = new TextDataViewer();
        } else if( tipoDeViewer.equals(ViewerFactory.HTML)){
            dataViewer = new HTMLDataViewer();
        }
        return dataViewer;
    }
}
