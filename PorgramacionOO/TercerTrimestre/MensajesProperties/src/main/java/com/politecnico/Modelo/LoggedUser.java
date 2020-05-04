package com.politecnico.Modelo;

import Modelo.Credencial;

public class LoggedUser {
    public Credencial credencial;
    private static LoggedUser instancia = null;

    public void setCredencial(Credencial cred){
        credencial = cred;
    }

    public static LoggedUser getInstance(){
        if (instancia == null)
            instancia = new LoggedUser();
        return instancia;
    }
}
