package com.politecnico;

public class Libros {

    //ATRIBUTOS DE LA CLASE LIBROS
    String autor;
    String titulo;
    String editorial;
    int numEdicion;
    String isbn;



    //CONSTRUCTOR PARAMETRIZADO DE LA CLASE LIBROS
    public Libros (String autor, String titulo){
        this.autor = autor;
        this.titulo = titulo;
    }

    //CONSTRUCTOR PARAMETRIZADO DE LA CLASE LIBROS
    public Libros (String titulo, String autor, String editorial, int numEdicion, String isbn ){
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.numEdicion = numEdicion;
        this.isbn = isbn;
    }


    //LOS GET NOS PERMITEN CONSULTAR INFORMACION SOBRE LOS ATRIBUTOS DEL OBJETO DE LA CLASE
    public String getAutor(){ return autor; }
    public String getTitulo(){ return titulo; }
    public String getEditorial(){ return editorial;}
    public int getNumEdicion(){ return numEdicion; }
    public String getIsbn(){ return isbn; }

    //LOS SET NOS PERMITEN EDITAR LOS ATRIBUTOS DE UN OBJETO PREFIAMENTE CREADO
    public void setAutor(String autor){ this.autor = autor; }
    public void setTitulo(String titulo){ this.titulo = titulo; }
    public void setEditorial(String editorial){ this.editorial = editorial; }
    public void setNumEdicion(int numEdicion){ this.numEdicion = numEdicion; }
    public void setIsbn(String isbn){ this.isbn = isbn; }
}

