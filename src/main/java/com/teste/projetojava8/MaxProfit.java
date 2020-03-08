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
public class MaxProfit {
    
    public static void main(String[] args) {
        int[] prices = {1,3,1,2} ; 
        System.out.println(getMaxProfit(prices));
        
        ArrayList<Integer> listInteger = new ArrayList<Integer>(){
            {
                add(1);
                add(3);
                add(1);
                add(2);
                
                    }
        };
        
            System.out.println(maximumProfit(listInteger));
        
        
    }
    
    public static long getMaxProfit(int[] prices) {
        long profit = 0L;
        int maxSoFar = 0;
        for (int i = prices.length - 1; i > -1 ; i--) {
            if (prices[i] >= maxSoFar) {
                maxSoFar = prices[i];
            }
            profit += maxSoFar - prices[i];
        }
        return profit;
    }
    
        public static long maximumProfit(List<Integer> price) {
        
            long profit = 0L;
            int maxSoFar = 0;
            for (int i = price.size() - 1; i > -1 ; i--) {
                if (price.get(i) >= maxSoFar) {
                    maxSoFar = price.get(i);
                }
                profit += maxSoFar - price.get(i);
            }
            return profit;            
            
            
        }    
    
    
    
    
    
}
