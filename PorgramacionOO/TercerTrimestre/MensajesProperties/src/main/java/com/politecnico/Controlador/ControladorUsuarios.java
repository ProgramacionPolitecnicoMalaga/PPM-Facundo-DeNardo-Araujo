package com.politecnico.Controlador;

import Controlador.ControladorAlgoritmo;
import Dao.CredencialDAO;
import Modelo.Credencial;
import com.politecnico.DAO.MensajeDAO;
import com.politecnico.Modelo.Mensaje;

import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.util.ArrayList;

public class ControladorUsuarios {
    ArrayList<Credencial> credenciales;
    CredencialDAO credencialDAO = new CredencialDAO();
    ControladorAlgoritmo controladorAlgoritmo = new ControladorAlgoritmo();

    public ControladorUsuarios() throws SQLException {
        credenciales = credencialDAO.devolverCredencialesBBDD();
    }

    public Boolean concederAcceso(String usuario, String pass) throws SQLException, NoSuchAlgorithmException {
        Credencial cred = credencialDAO.buscarCredencialByNombre(usuario);
        String sal = cred.getSalt();
        String hashBD = cred.getHash();
        return controladorAlgoritmo.comprobarPassword(cred.getAlgoritmoUsado(), pass, hashBD, sal);
    }

    public Credencial obtenerCredencialPorNombre(String usuario) throws SQLException {
        return credencialDAO.buscarCredencialByNombre(usuario);
    }
}
