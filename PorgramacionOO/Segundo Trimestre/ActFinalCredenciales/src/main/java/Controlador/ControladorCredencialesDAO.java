package Controlador;

import Dao.CredencialDAO;
import Modelo.Credencial;

import javax.swing.*;
import java.sql.SQLException;
import java.util.ArrayList;

public class ControladorCredencialesDAO {
    CredencialDAO credencialDAO;

    public ControladorCredencialesDAO() throws SQLException {
        credencialDAO = new CredencialDAO();
    }

    public void mostrarCredencialesRegistradas(DefaultListModel listModel, Credencial credencial) throws SQLException {
        ArrayList<Credencial> credenciales = new ArrayList<>();
        Credencial cr = new Credencial(credencial.getId(),credencial.getNombre(),credencial.getHash(),credencial.getAlgoritmoUsado(),credencial.getSalt());
        cr.setPassUsada(credencial.getPassUsada());
        cr.setEstadoCredencial(credencial.isEstadoCredencial());
        credenciales.add(cr);
        for (Credencial cred : credenciales)
            listModel.addElement(cred);
    }

    public void mostrarNombresCredencialesRegistradas(DefaultListModel listModel) throws SQLException {
        ArrayList<Credencial> credenciales = credencialDAO.devolverCredencialesBBDD();
        listModel.clear();
        for (Credencial cred : credenciales)
            listModel.addElement(cred);
    }

    public void registrarCredencial(String nombre, String hash, String algoritmo, String salt) throws SQLException {
        credencialDAO.registrarCredenccial(nombre, hash, algoritmo, salt);
    }

    public void borrarCredencial(String id) throws SQLException {
        credencialDAO.borrarItem(id);
    }

    public Credencial obtenerCredencialById(String id) throws SQLException {
        return credencialDAO.buscarCredencialById(id);
    }
}
