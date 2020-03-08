/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teste.projetojava8;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lprates
 */
public class TesteUol {
    
        
    public static void main (String args[]){
        
        
        //int retorno = minNum(3, 5, 1) ;
        //System.out.println(retorno);
        
        String valor = "pcmpcmbbbzz" ; 
        
        int totalgrupos = differentTeams(valor) ; 
        
        
       System.out.println( "total Grupos : " + totalgrupos ) ;
                
    }
    
    private static int differentTeams(String skills) {
        
        int totalgrupos = 0 ; 
        int totalarray = skills.length(); 
        int i = 0 ;
        
        List<String> listaString = new ArrayList<String>() ; 
        
        while ( i < totalarray  ){
            System.out.println(skills.charAt(i)  );
            char valorChar = skills.charAt(i) ; 
            listaString.add( String.valueOf( valorChar)) ; 
            i++ ; 
        }
        

        //System.out.println( "Contain p : " + listaString.contains("p") ) ;
        //System.out.println( "Contain p : " + listaString.indexOf("p") ) ;
        
        //System.out.println( "Remove" ) ;
        
        //listaString.remove(0) ;
        
        //System.out.println( "Contain p : " + listaString.contains("p") ) ;
        //System.out.println( "Contain p : " + listaString.indexOf("p") ) ;
        
        
        while ( true ){
            
            
            if ( listaString.contains("p") ){
                int indice = listaString.indexOf("p") ; 
                listaString.remove(indice) ;            
            } else{
                break;
            }
            
            if ( listaString.contains("c") ){
                int indice = listaString.indexOf("c") ; 
                listaString.remove(indice) ;            
            } else{
                break;
            }
            
            if ( listaString.contains("m") ){
                int indice = listaString.indexOf("m") ; 
                listaString.remove(indice) ;            
            } else{
                break;
            }
            
            if ( listaString.contains("b") ){
                int indice = listaString.indexOf("b") ; 
                listaString.remove(indice) ;            
            } else{
                break;
            }
            
            if ( listaString.contains("z") ){
                int indice = listaString.indexOf("z") ; 
                listaString.remove(indice) ;            
            } else{
                break;
            }
            
            
            totalgrupos++;
            
        }
        
        return totalgrupos ; 
    }
    
    
    
    
    
    
    public static int minNum(int A, int K, int P) {
    
        //int totalafrente = A + P ;
        int totalafrente = 0;
        int totalaatras = 0 ;
        
        
        int totaldias = 0 ; 
        
        if ( K <= A){
            return -1 ;
        }
        
        System.out.println("geral: ");
        
        
        while ( totalaatras <= totalafrente ) {
            
            if ( totaldias == 0  ){
                totalafrente = totalafrente + A + P;
                
                System.out.println("totalafrente 0 : " + totalafrente);
                
            }else{
                totalafrente = totalafrente + A ;
                
                System.out.println("totalafrente else 0 : " + totalafrente);
            }
            
            totalaatras = totalaatras + K;
            
            System.out.println("totalaatras: " + totalaatras);
            

            totaldias++;
        } 
        
        
        return totaldias ; 
        

    }    
    
    
}
