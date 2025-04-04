package Modelos;

import java.util.ArrayList;
import java.util.List;

public class prestamoModelo {
    private String nombre;
    private String tituloLibro;

    public static List<prestamoModelo> prestamoModelos = new ArrayList<prestamoModelo>();

    public prestamoModelo() {
    }

    public prestamoModelo(String nombre, String tituloLibro) {
        this.nombre = nombre;
        this.tituloLibro = tituloLibro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTituloLibro() {
        return tituloLibro;
    }

    public void setTituloLibro(String tituloLibro) {
        this.tituloLibro = tituloLibro;
    }
}
