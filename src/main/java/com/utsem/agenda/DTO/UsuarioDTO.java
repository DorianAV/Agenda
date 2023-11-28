package com.utsem.agenda.DTO;

;

public class UsuarioDTO {
    private String Nombre;

    private String usuario;
    private String correo;
    private String contraseñaLogin;


    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseñaLogin() {
        return contraseñaLogin;
    }

    public void setContraseñaLogin(String contraseñaLogin) {
        this.contraseñaLogin = contraseñaLogin;
    }
}
