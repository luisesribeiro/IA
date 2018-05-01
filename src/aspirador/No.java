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
public class No {
    
    Estado e = new Estado();
    
    No noPai;
    
    int profundidade;
    
    String acao;
   
    public void setNoPai(No noPai){
        
        this.noPai = noPai;
        
    }
    
    public void setProfundidade(No n){
        
        if (noPai == null){
            
            profundidade = 0;
            
        }else{
            
            profundidade = noPai.profundidade +1;
        }
        
    }
    
    public int getProfundidade(No n){
        
        return n.profundidade;
        
    }
    
    public No getNoPai(No n){
        
        return n.noPai;
        
    }
    
    public void exibeNo(No n){
        
        n.e.exibeEstado(e);
        
        System.out.println ("Profundidade: "+n.getProfundidade(n));
        
        System.out.println ("");
        
    }
    
    public boolean testeObjetivo(No n){
        
        if (n.e.amb.vet[0] == 0 && n.e.amb.vet[1] == 0){
            
            return true;
            
        } else{
            
            return false;
            
        }   
        
    }
    
}
