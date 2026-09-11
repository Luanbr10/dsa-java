/**
 * Problema 1065 - Pares entre Cinco Números
 * Faça um programa que leia 5 valores inteiros. Conte quantos destes valores digitados são pares e mostre esta informação.
 * https://judge.beecrowd.com/pt/problems/view/1065
 */

import java.util.Scanner;

public class ParesCincoNumeros{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];
        int cont = 0;

        for (int i = 0; i < numeros.length; i++){
            numeros[i] = sc.nextInt();
        }

        for (int num : numeros){
            if (num % 2 == 0){
                cont++;
            }
        }

        System.out.printf("%d valores pares\n", cont);

    }
}