/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import java.util.ArrayList;
import java.util.List;

public class librosModelos {
    private String titulo;
    private String genero;
    public String autor;
    
    public static List<librosModelos> listaLibrosModelos = new ArrayList<>();

    public librosModelos() {
    }
    
    

    public librosModelos(String titulo, String genero, String autor) {
        this.titulo = titulo;
        this.genero = genero;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        genero = genero;
    }


    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }


    

    public void insertarLibro(librosModelos libro) {
        listaLibrosModelos.add(libro);
    }

    public List<librosModelos> listarLibros() {
        
        return listaLibrosModelos;
    }
}
