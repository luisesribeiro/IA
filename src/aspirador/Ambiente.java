/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aspirador;

import java.util.Random;

/**
 *
 * @author lewis
 */

public class Ambiente {
    
    int vet[] = new int[2]; //Ambiente com duas posições
    
    public Ambiente(){
    
        int i;
    
        Random aleatorio = new Random();
        
        for (i=0;i < vet.length;i++){
            
           vet[i] = aleatorio.nextInt(2); // 1 se sujo 0 se limpo
            
        }
        
    }
    
    public void exibeAmbiente(){
        
        int i;
        
        for (i=0;i< vet.length;i++){
        
            System.out.println ("VET["+i+"] = "+vet[i]);
            
        }
    }
   
    
}
