/**
 * Problema 1042 - Sort Simples
 * Leia 3 valores inteiros e ordene-os em ordem crescente. 
 * No final, mostre os valores em ordem crescente, uma linha em branco e em seguida, os valores na sequência como foram lidos.
 * https://judge.beecrowd.com/pt/problems/view/1042
 */

import java.util.Scanner;
import java.util.Arrays;

public class SortSimples{
    public static void main(String []args){

        Scanner sc = new Scanner(System.in);

        int[] numLista = new int[3];

        for (int i = 0; i < numLista.length; i++){
            numLista[i] = sc.nextInt();
        }

        int[] auxLista = Arrays.copyOf(numLista, numLista.length);

        Arrays.sort(numLista);

        for (int i = 0; i < numLista.length; i++){
           System.out.println(numLista[i]);
        }

        System.out.println();

        for (int i = 0; i < numLista.length; i++){
           System.out.println(auxLista[i]);
        }
    }
}