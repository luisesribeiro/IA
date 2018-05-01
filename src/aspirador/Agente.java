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
public class Agente{
    
    int pos;
    
    public Agente(){
        
        Random aleatorio = new Random();
        
        pos = aleatorio.nextInt(2);
        
        
    }
    
    public void setPosicao(int num){
        
        pos = num;
        
    }
    
    public int getPosicao(){
        
        return pos;
        
    }
    
    public void exibePosicao(){
        
       System.out.println ("Posição do agente: "+pos);
        
    }
    
}
