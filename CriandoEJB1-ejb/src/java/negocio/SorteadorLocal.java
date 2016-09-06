/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import javax.ejb.Local;

/**
 *
 * @author João Batista
 */
@Local
public interface SorteadorLocal {

    int getNumero(int minimo, int maximo);
    
}
