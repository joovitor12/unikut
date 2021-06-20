/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryMethod;

import java.util.List;

import models.Usuario;

/**
 *
 * @author j-vit
 */
public interface RecadoInterface  {

    /**
     *
     * @param usuarios
     */
    public void enviaRecados(List<Usuario> usuarios);
}
