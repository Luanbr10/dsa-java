/**
 * Problema 1059 - Numeros Pares
 * Faça um programa que mostre os números pares entre 1 e 100, inclusive, sem entrada.
 * https://judge.beecrowd.com/pt/problems/view/1059
 */

public class NumerosPares{
    public static void main(String[] args){
        for (int i = 1; i <= 100; i++){
            if (i % 2 == 0) System.out.println(i);
        }
    }
}