package Modelos;

import java.util.ArrayList;
import java.util.List;

public class UsuarioModelos extends personaModelo{
    public String correo;

   

    public UsuarioModelos(String correo) {
        this.correo = correo;
    }

    public UsuarioModelos(String nombre, String apellido, int edad, String correo) {
        super(nombre, apellido, edad);
        this.correo = correo;
    }

    public String getCorreo() {
        return correo;
    }


    public void setCorreo(String correo) {
        this.correo = correo;
    }


    public void setListaUsuarios(List<UsuarioModelos> listaUsuarios) {
        UsuarioModelos.listaUsuarios = listaUsuarios;
    }


    public List<UsuarioModelos> getListaUsuarios() {
        return listaUsuarios;
    }
}
