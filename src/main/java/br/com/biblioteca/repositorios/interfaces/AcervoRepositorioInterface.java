/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.br.com.biblioteca.repositorios.interfaces;

import java.util.Optional;
import main.java.br.com.biblioteca.entidades.AcervoEntidade;

/**
 *
 * @author lucas
 */
public interface AcervoRepositorioInterface {

    Optional<AcervoEntidade> buscarPorId(Integer id);
}
