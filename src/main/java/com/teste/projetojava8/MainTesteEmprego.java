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
public class MainTesteEmprego {
    
    public static void main(String[] args) {
        
        Outer outer = new Outer();
        
        //System.out.println(outer.getTexto() )  ; 
        
        //Outer.Inner inner = outer.new Inner(); 
        
        //inner.print();
    }
    
    
}

class Outer {
    
    private String texto = "OI sou de fora " ; 

    
    public Outer(){
        System.out.println("construtor outer " ) ; 
        
        (new Inner()).print();
    }
    
    
    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    
    
    class Inner extends Emprego {
        
        private String texto = "Dentro do Inner "; 
        
        public void print(){
            System.out.println("Dentro metodo print Inner class: " + texto ) ; 
            
            System.out.println("Chamando metodo de fora " + getTexto());
            
        }
        
    }
    
}


class Emprego{
    
}