/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teste.projetojava8;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

/**
 *
 * @author lprates
 */
public class Main {
    
    
    public static void main(String args[]) throws IOException{
        
        System.out.println("=================  Inicio do processamento  ======================") ;
        
        String diretorio = "C:/Users/lprates/Desktop/arquivos" ; 
        
        List<String> listaArquivos = new ArrayList<String>();
        List<Arquivo> listaObjectArquivos = new ArrayList<Arquivo>();
        
        Files.list( Paths.get(diretorio) )
                .filter(Files::isRegularFile)
                .forEach(  x ->  { 
                                    System.out.println("Arquivo: " + x ); 
                                    listaArquivos.add(x.toFile().getAbsolutePath()  ); 
                                }
                        ) ;
                
        
        System.out.println("===Imprimindo Lista de Arquivos===") ;
        
        listaArquivos.forEach( x -> System.out.println(x) );
        
        System.out.println("===Lendo Arquivos====") ;

        
        listaArquivos.forEach( x -> {
            
                try (BufferedReader reader = Files.newBufferedReader(Paths.get( x ))) {
                                            
                                            
                    String linha = reader.readLine() ;                             
                    String idArquivo = linha.substring(0, 2);
                    String idRemessa = linha.substring(2, 5);                            

                    System.out.println("IdArquivo : " + idArquivo + " IdRemessa: " + idRemessa ) ; 
                    
                    Arquivo arquivo = new Arquivo(); 
                    arquivo.setIdRemessa(Long.parseLong(idRemessa));
                    arquivo.setNomeArquivo(x);
                    
                    listaObjectArquivos.add(arquivo);
                    
                                            
                }catch (IOException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            
        } );
        
        
        System.out.println("===Lendo Objeto Arquivo====") ;
        
        listaObjectArquivos.forEach( o ->  { 
            
            System.out.println("NomeArquivo : " + o.getNomeArquivo() + " IdRemessa: " + o.getIdRemessa() ) ; 
            
        } );
        
        System.out.println("==========================  Fim do processamento  =========================") ; 

        
    }//main
    
}




class Arquivo{
    
    private long idRemessa;
    private String nomeArquivo;

    public long getIdRemessa() {
        return idRemessa;
    }

    public void setIdRemessa(long idRemessa) {
        this.idRemessa = idRemessa;
    }

    public String getNomeArquivo() {
        return nomeArquivo;
    }

    public void setNomeArquivo(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }
    
    
    
    
}