/**
 * Problema 1067 - Numeros ímpares
 * Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o X, se for o caso.
 * https://judge.beecrowd.com/pt/problems/view/1067
 */

import java.util.Scanner;

public class NumerosImpares{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for (int i = 1; i <= num; i+=2){
            System.out.println(i);
        }
    }
}