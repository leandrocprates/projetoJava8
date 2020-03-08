/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teste.projetojava8;

import com.teste.projetojava8.interfacegenerica.InterfaceGenerica;
import com.teste.projetojava8.interfacegenericaimpl.Relatorio001;
import com.teste.projetojava8.interfacegenericaimpl.Relatorio002;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 *
 * @author lprates
 */
public class MainTesteInterfaceGenerica {
    
    public static void main(String[] args) {
        
        Relatorio001 relatorio001 = new Relatorio001();
        Relatorio002 relatorio002 = new Relatorio002();
        
        InterfaceGenerica interfaceGenerica001 =  relatorio001 ; 
        InterfaceGenerica interfaceGenerica002 =  relatorio002 ; 
        
        Class<?>   classe =  interfaceGenerica001.getClass();
        Method[] metodosDisponiveis = classe.getDeclaredMethods();
        for ( Method metodo :  metodosDisponiveis ){
            System.out.println(metodo.getName());
        } 
        
        executar(interfaceGenerica001);
        
    }
    
    public static void executar(InterfaceGenerica interfaceGenerica){
        
        try{
            Class<?>   classe =  interfaceGenerica.getClass();
            
            Method  metodoGetNome = classe.getMethod("getNome") ; 
            String  resposta = (String) metodoGetNome.invoke(interfaceGenerica);
            
            System.out.println(resposta);
            
        }catch(NoSuchMethodException  | IllegalAccessException | InvocationTargetException noEx){
            System.out.println("Metodo nao existe para a classe:  " + noEx );
        }
        
    }
    
    
    
    
}
