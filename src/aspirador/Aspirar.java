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
public class Aspirar extends Acao{
    
    public Aspirar(String nome){
        
        super(nome);
        
    }

    @Override
    public No acao(No n) {
        
         if (n.e.amb.vet[n.e.a.getPosicao()] == 1){
                        
          n.e.amb.vet[n.e.a.getPosicao()] = 0;
            
        }
        
         return n;
    }
    
}
