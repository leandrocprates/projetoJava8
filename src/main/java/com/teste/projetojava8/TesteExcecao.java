/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teste.projetojava8;

/**
 *
 * @author lprates
 */
public class TesteExcecao {
    
    
    public static void main(String args[]){
        
        


        int valoreretornado = testeint() ; 
        System.out.println(valoreretornado);
        
        
        
    }
    
    public static int testeint(){
        
        try{
            
            int x = 4 / 0 ;  
            
            return x ; 
        }catch(RuntimeException ex){
            System.out.println("Excecao run time ");
        }finally{
            System.out.println("Finally ");
            return -1 ;
        }        
        
        
    }
    
    
    
    
    
    
    
}
