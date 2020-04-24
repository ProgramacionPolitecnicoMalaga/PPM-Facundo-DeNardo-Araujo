package com.politecnico.Modelo;

public class Mensaje {
    private int emisor;
    private int receptor;
    private String titulo;
    private String contenido;

    public Mensaje(int emisor, int receptor, String titulo,String contenido){
        this.emisor =emisor;
        this.receptor = receptor;
        this.titulo = titulo;
        this.contenido = contenido;
    }

    public int getEmisor() {
        return emisor;
    }

    public void setEmisor(int emisor) {
        this.emisor = emisor;
    }

    public int getReceptor() {
        return receptor;
    }

    public void setReceptor(int receptor) {
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
}
