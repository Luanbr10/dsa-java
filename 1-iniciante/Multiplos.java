/**
 * Problema 1044 - Múltiplos
 * Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem 
 * "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos são múltiplos entre si.
 * https://judge.beecrowd.com/pt/problems/view/1044
 */

import java.util.Scanner;

public class Multiplos{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int numMultiplo = sc.nextInt();

        boolean ehMultiplo = (numMultiplo % num == 0 || num % numMultiplo == 0);

        if (ehMultiplo){
            System.out.println("Sao Multiplos");
        }
        else{
            System.out.println("Nao sao Multiplos");
        }

        sc.close();
    }
        
}