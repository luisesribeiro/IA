/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aspirador;

/**
 *
 * @author lewis
 */
public class Direita extends Acao {
   
    public Direita(String nome){
        
        super(nome);
        
    }

    @Override
    public No acao(No n) {
        
        if (n.e.a.getPosicao() != 1){
                        
           n.e.a.setPosicao(1);
            
        }
        
        return n;
        
    }
    
   
}
