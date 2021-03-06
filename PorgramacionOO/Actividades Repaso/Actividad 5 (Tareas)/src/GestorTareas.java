import java.time.LocalDate;
import java.util.ArrayList;
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

    public ArrayList<Tarea> tareasEnFecha(LocalDate fecha){
        ArrayList<Tarea> fechaBuscada = new ArrayList<>();
        for (Tarea tarea: tareas)
            if (tarea.getFechaLimite().isEqual(fecha))
                fechaBuscada.add(tarea);
                return fechaBuscada;
    }

    public ArrayList<Tarea> tareasEnTiempo(){
        ArrayList<Tarea> tareasEnTiempo = new ArrayList<>();
        for (Tarea tarea : tareas)
            if (tarea.getFechaLimite().isEqual(LocalDate.now()))
                tareasEnTiempo.add(tarea);
            return tareasEnTiempo;
    }

    public ArrayList<Tarea> tareasRetrasadas(){
        ArrayList<Tarea> tareasRetrasadas = new ArrayList<>();
        for (Tarea tarea : tareas)
            if (tarea.getFechaLimite().isBefore(LocalDate.now()))
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
