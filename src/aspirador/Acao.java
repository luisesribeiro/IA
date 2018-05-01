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
public abstract class Acao {
    
    String nome;
    
    public Acao(String nome){
        
        this.nome = nome;
        
    }
    
    public  abstract No acao(No n);
    
}
