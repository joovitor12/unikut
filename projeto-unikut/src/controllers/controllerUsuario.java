
package controllers;

import java.util.List;

import models.Usuario;


public class controllerUsuario {
    
    public static Usuario buscaUsuarioSenha(String senha, List<Usuario> usuarios) {
        if (usuarios != null) {
            for (int i = 0; i < usuarios.size(); i++) {
                if (usuarios.get(i).getSenha().equals(senha)) {
                    return usuarios.get(i);
                }
            }
        }
        return null;
    }
    public static Usuario acessaConta(Usuario cad, List<Usuario> usuarios) {
        if (usuarios.contains((cad))) {
            
            return cad;
        } else {
            return null;
        }
    }
    public static Usuario buscaUsuarioLogin(String login, List<Usuario> usuarios) {
        if (usuarios != null) {
            for (int i = 0; i < usuarios.size(); i++) {
                if (usuarios.get(i).getLogin().equals(login)) {
                    return usuarios.get(i);
                }
            }
        }
        return null;

    }
}
