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
public class Esquerda extends Acao {
    
    public Esquerda(String nome){
        
        super(nome);
        
    }

    @Override
    public No acao(No n) {
          
        if (n.e.a.getPosicao() != 0){
                        
           n.e.a.setPosicao(0);
            
        }
        
        return n;
        
    }
    
    
}
