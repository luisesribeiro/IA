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
public class Estado {
    
    Agente a = new Agente();
    
    Ambiente amb = new Ambiente();
    
    Acao acao[] = new Acao[3];
    
    public Estado(){
        
        acao[0] = new Direita("Direita");
        
        acao[1] = new Aspirar("Aspirar");
        
        acao[2] = new Esquerda("Esquerda");
        
    }

    public void exibeEstado(Estado e){
        
        e.amb.exibeAmbiente();
        
        e.a.exibePosicao();
                
    }
    
}
