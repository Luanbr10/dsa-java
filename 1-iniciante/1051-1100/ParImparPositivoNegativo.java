/**
 * Problema 1066 - Pares, ímpares, Positivos e Negativos
 * Leia 5 valores Inteiros. A seguir mostre quantos valores digitados foram pares, quantos valores digitados foram ímpares, 
 * quantos valores digitados foram positivos e quantos valores digitados foram negativos.
 * https://judge.beecrowd.com/pt/problems/view/1066
 */

import java.util.Scanner;

public class ParImparPositivoNegativo{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];
        int[] contClassificacao = new int[4];
        
        for (int i = 0; i < numeros.length; i++){
            numeros[i] = sc.nextInt();
        }

        for (int num : numeros){

            if (num % 2 == 0){
                contClassificacao[0]++; 
            }
            else{
                contClassificacao[1]++;
            }

            if (num > 0){
                contClassificacao[2]++;
            }
            else if (num < 0){
                contClassificacao[3]++;
            }
        }

        System.out.printf("%d valor(es) par(es)\n", contClassificacao[0]);
        System.out.printf("%d valor(es) impar(es)\n", contClassificacao[1]);
        System.out.printf("%d valor(es) positivo(s)\n", contClassificacao[2]);
        System.out.printf("%d valor(es) negativo(s)\n", contClassificacao[3]);

    }
}