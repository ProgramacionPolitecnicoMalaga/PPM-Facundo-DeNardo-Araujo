package com.politecnico.Configuracion;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Propiedades {
    public final static String NOMBRE_ARCHIVO = "config.properties";
    private Properties properties;

    public Propiedades() throws IOException{
        File archivoPropoiedades = new File(NOMBRE_ARCHIVO);
        properties = new Properties();
        if (archivoPropoiedades.exists()){
            properties.load(new FileInputStream(archivoPropoiedades));
        }
    }

    public String getPropiedad(String nombre){
        return  properties.getProperty(nombre);
    }

    public void setpropiedad(String key, String value){
        properties.setProperty(key,value);
    }

    public void guardar() throws IOException{
        FileOutputStream outputStream = new FileOutputStream(new File(NOMBRE_ARCHIVO));
        properties.store(outputStream,"Config.");
    }

    public void recordarUsuario(String nombreUsuario, String Contraseña) throws IOException {
        properties.setProperty("usuario", nombreUsuario);
        properties.setProperty("pass", Contraseña);
        guardar();
    }
}
