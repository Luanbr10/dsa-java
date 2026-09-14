/**
 * Problema 1073 - Quadrado de Pares
 * Leia um valor inteiro N. Apresente o quadrado de cada um dos valores pares, de 1 até N, inclusive N, se for o caso.
 * https://judge.beecrowd.com/pt/problems/view/1073
 */

import java.util.Scanner;

public class QuadradoPares{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int produto = 0;
        
        if (num % 2 == 0){
            for (int i = 2; i <= num; i += 2){
                produto = (int) Math.pow(i, 2);
                System.out.printf("%d^2 = %d\n", i, produto);
            }
        }

        else{
            for (int i = 1; i <= num; i += 2){
                produto = (int) Math.pow(i, 2);
                System.out.printf("%d^2 = %d\n", i, produto);
            }
        }
    }
}