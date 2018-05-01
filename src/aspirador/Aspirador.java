/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aspirador;

import java.util.ArrayList;

/**
 *
 * @author lewis
 */
public class Aspirador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int i;
        
        No n = new No(), n2 = new No();
        
        n.setNoPai(null);
        
        n.setProfundidade(n);
        
        n.exibeNo(n);
        
        ArrayList<No> borda = new ArrayList<No>();
        
        ArrayList <No> expandidos = new ArrayList<No>();
        
        borda.add(0,n); // adiciona no inicial à pilha de elementos gerados mas não expandidos
        
        while (!borda.get(0).testeObjetivo(borda.get(0))){
            
            expandidos.add(borda.get(0)); // adiciona no à lista de expandidos
            
            borda.remove(0); // retira nó expandido da pilha de elementos gerados, mas nao expandidos
            
            //Processo de expansão dos nós
            
            for(i=0;i<n2.e.acao.length;i++){ //Para cada ação possível em um determinado estado
                
                n2 = n; // Estrutura auxiliar que receberá os novos estados gerados
                    
                n2.setNoPai(n); // Coloca o no anterior como nó pai
                    
                n2.setProfundidade(n2); //Atualiza a profundidade do no em questão
                
                n2 = n2.e.acao[i].acao(n2); // Aplica ação ao estado corrente e retorna o estado resultante
                
                borda.add(0,n2); //adiciona novo estado gerado à borda.            
                
            }
            
            n = n2;
            
         }  

         System.out.println ("Estado objetivo");
        
         borda.get(0).exibeNo(borda.get(0));
         

    }
    
}
