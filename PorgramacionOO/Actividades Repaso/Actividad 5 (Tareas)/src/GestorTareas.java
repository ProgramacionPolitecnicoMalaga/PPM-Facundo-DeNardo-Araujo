import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class GestorTareas {
    ArrayList<Tarea> tareas;
    ArrayList<Categoria> categorias;

    public GestorTareas(){
        tareas = new ArrayList<>();
        categorias = new ArrayList<>();
    }

    public void addTarea(Tarea tarea){
        tareas.add(tarea);
    }

    public ArrayList<Tarea> tareasEnFecha(Date fecha){
        ArrayList<Tarea> fechaBuscada = new ArrayList<>();
        for (Tarea tarea: tareas)
            if (tarea.getFechaLimite().compareTo(fecha) == 0)
                fechaBuscada.add(tarea);
                return fechaBuscada;
    }

    public ArrayList<Tarea> tareasEnTiempo(){
        Date fechaActual = new Date();
        ArrayList<Tarea> tareasEnTiempo = new ArrayList<>();
        for (Tarea tarea : tareas)
            if (tarea.getFechaLimite().compareTo(fechaActual) > -1)
                tareasEnTiempo.add(tarea);
            return tareasEnTiempo;
    }

    public ArrayList<Tarea> tareasRetrasadas(){
        Date fechaActual = new Date();
        ArrayList<Tarea> tareasRetrasadas = new ArrayList<>();
        for (Tarea tarea : tareas)
            if (tarea.getFechaLimite().compareTo(fechaActual) < 0)
                tareasRetrasadas.add(tarea);
        return tareasRetrasadas;
    }

    public ArrayList<Tarea> tareasDeUnaCategoria(Categoria categoria){
        ArrayList<Tarea> tareasDeCategoria = new ArrayList<>();
        for (Tarea tarea: tareas)
            if (tarea.getCategoria().equals(categoria))
                tareasDeCategoria.add(tarea);
            return tareasDeCategoria;
    }

    public ArrayList<Tarea> consultarPendientes(){
        ArrayList<Tarea> pendientes = new ArrayList<>();
        for (Tarea tarea : tareas)
            if (!tarea.isCompletada())
                pendientes.add(tarea);
            return pendientes;
    }

    public ArrayList<Categoria> listaCategorias(){
        for (Tarea tarea:tareas)
            categorias.add(tarea.getCategoria());
        Set<Categoria> hs = new HashSet<>(categorias);
        categorias.clear();
        categorias.addAll(hs);
        return categorias;
    }

    public ArrayList<Categoria> addCategoria(Categoria categoria){
        categorias.add(categoria);
        return categorias;
    }

}
