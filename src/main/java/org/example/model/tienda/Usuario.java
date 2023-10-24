package org.example.model.tienda;

public class Usuario {
    String usuarioId;
    String usuarioPasword;

    public Usuario(String usuarioId, String usuarioPasword) {
        this.usuarioId = usuarioId;
        this.usuarioPasword = usuarioPasword;
    }

    public String getUsuarioId() {
        return usuarioId;
    }

    public String getUsuarioPasword() {
        return usuarioPasword;
    }
}
