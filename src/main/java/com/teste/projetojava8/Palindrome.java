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
public class Palindrome {
 
    
    public static void main(String[] args) {
        
        String palavra = "daata";
        System.out.println(  countPalindromeSubstrings(palavra)  ) ; 
        
    }
    
 public static int countPalindromeSubstrings(String s)
    {
        String a;
        int countSubs=s.length();
        for(int i=0;i<s.length();i++)
        {
          for(int j=i+2;j<=s.length();j++)
          {
            a=s.substring(i,j);
            countSubs+=count(a);
          }
        }
        return countSubs;
    }
    public static int count(String a)
    {
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i)!=a.charAt(a.length()-1-i))
                return 0;
        }
        return 1;
    }
    
    
    
    
    
}
