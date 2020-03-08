/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teste.projetojava8;

import java.io.IOException;

import java.util.PriorityQueue ; 

/**
 *
 * @author lprates
 */
public class PriorityQueueTeste {
    
    
    public static void main(String args[]) {
        PriorityQueue prior = new PriorityQueue();
        prior.add("dishes");
        prior.add("laundry");
        prior.add("bills");
        prior.offer("bills");
        
        System.out.println(prior.size() + " - "+ prior.poll());
        
        System.out.println(prior.peek() + " - "+ prior.poll());

        System.out.println(prior.poll() + " - "+ prior.poll());
        
        
    }
    
}
