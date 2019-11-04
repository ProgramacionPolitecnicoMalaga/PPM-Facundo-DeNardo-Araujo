package com.politecnico;

import java.util.Scanner;

public class Bibliotecario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        int opcion;
        String tituloLibro;
        String autorLibro;
        String editorialLibro;
        int edicionLibro;
        String isbnLibro;


        System.out.println("Introduce titulo del libro: ");
        tituloLibro = sc.nextLine();
        System.out.println("Introduce autor del libro: ");
        autorLibro = sc.nextLine();
        Libros libro1 = new Libros(tituloLibro,autorLibro);
        System.out.println(libro1.getAutor() + "\n" + libro1.getTitulo());


        }






}
