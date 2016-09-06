/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Wazco
 */
@Local
public interface SorteadorMemoriaLocal {

    List<Integer> ListarNumerosSorteados();

    void removeNumeroSorteado(int numero);

    void salvaNumeroSorteado(int num1, int num2);

    

 

   

   

    

    

    

  
    
}
