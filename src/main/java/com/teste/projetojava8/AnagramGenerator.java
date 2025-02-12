package com.teste.projetojava8;


import java.util.ArrayList;
import java.util.List;

public class AnagramGenerator {

    public static void main(String[] args) {
        char[] letras = {'a', 'b', 'c'};
        List<String> anagrams = generateAnagrams(letras);

        // Print all generated anagrams
        for (String anagram : anagrams) {
            System.out.println(anagram);
        }
    }

    private static List<String> generateAnagrams(char[] letras) {
        List<String> result = new ArrayList<>();
        permute(letras, 0, result);
        return result;
    }

    private static void permute(char[] letras, int start, List<String> result) {
        if (start == letras.length - 1) {
            result.add(new String(letras)); // Add the current permutation to the result
            return;
        }

        for (int i = start; i < letras.length; i++) {
            swap(letras, start, i); // Swap the current element
            permute(letras, start + 1, result); // Recurse for the next level
            swap(letras, start, i); // Backtrack to restore the original state
        }
    }

    private static void swap(char[] letras, int i, int j) {
        char temp = letras[i];
        letras[i] = letras[j];
        letras[j] = temp;
    }
}
