/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import negocio.SorteadorLocal;
import negocio.SorteadorMemoriaLocal;


@Named
@SessionScoped
public class PaginaDaSorteBean  implements Serializable {

    @EJB(name = "sorteadorBeans")
    private SorteadorLocal sorteadorBeans;

    @EJB(name = "sorteadormemoriaBean")
    private SorteadorMemoriaLocal sorteadormemoriaBean;

    private int num1;
    private int num2;
    private int resultado;
    private List<Integer>sorteados;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    
    public void sortear() {
     
       sorteadormemoriaBean.salvaNumeroSorteado(num1, num2);
       resultado = sorteadormemoriaBean.ListarNumerosSorteados().get(sorteadormemoriaBean.ListarNumerosSorteados().size()-1);
       
    }

    public int getResultado() {
        return resultado;
    }
   
    public void removerNumeroSorteado(int numero){
      sorteadormemoriaBean.removeNumeroSorteado(numero);
    }

    public List<Integer> getSorteados() {
        sorteados = sorteadormemoriaBean.ListarNumerosSorteados();
        return sorteados;
    }
        
}
