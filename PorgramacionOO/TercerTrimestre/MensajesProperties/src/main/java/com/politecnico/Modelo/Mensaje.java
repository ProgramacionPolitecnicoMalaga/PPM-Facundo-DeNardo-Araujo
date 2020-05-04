package com.politecnico.Modelo;

public class Mensaje {
    private String emisor;
    private String receptor;
    private String titulo;
    private String contenido;

    public Mensaje(String emisor, String receptor, String titulo, String contenido){
        this.emisor =emisor;
        this.receptor = receptor;
        this.titulo = titulo;
        this.contenido = contenido;
    }

    public String getEmisor() {
        return emisor;
    }

    public void setEmisor(String emisor) {
        this.emisor = emisor;
    }

    public String getReceptor() {
        return receptor;
    }

    public void setReceptor(String receptor) {
        this.receptor = receptor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return "Mensaje: " + titulo + "\n" + "De: " + emisor;
    }
}
