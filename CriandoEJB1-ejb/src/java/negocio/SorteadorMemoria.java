/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateful;
import javax.ejb.TransactionAttribute;
import static javax.ejb.TransactionAttributeType.REQUIRES_NEW;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;


/**
 *
 * @author Wazco
 */
@Stateful
@TransactionManagement(TransactionManagementType.BEAN)

public class SorteadorMemoria implements SorteadorMemoriaLocal {

    @EJB(name = "sorteadorBean")
    private SorteadorLocal sorteadorBean;
    int resultado;
    
    List<Integer> sorteados = new ArrayList<Integer>();
 

    @Override
    public List<Integer> ListarNumerosSorteados() {
        return sorteados;
    }

    @Override
    public void removeNumeroSorteado(int numero) {
        sorteados.remove(numero);
    }

    @Override
    public void salvaNumeroSorteado(int num1, int num2) {
        sorteados.add(sorteadorBean.getNumero(num1,num2));
        
    }

  
}
