/**
    Problema 1003 - Soma Simples
    Exibir a soma de 2 números inteiros, com a impressão "SOMA = valor"
    https://judge.beecrowd.com/pt/problems/view/1003
 */

import java.util.Scanner;

public class SomaSimples{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int SOMA = A+B;

        System.out.printf("SOMA = %d\n", SOMA);
    }
}