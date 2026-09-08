/**
 * Problema 1018 - Cédulas
 * o programa deve ler um aux inteiro (0 < n < 1000000) e destrinchar o aux em questão para o menor numero de cédulas possível, entre notas de 100, 50, 20, 10, 5, 2 e 1
 * https://judge.beecrowd.com/pt/problems/view/1018
 */

import java.util.Scanner;

public class Cedulas{
    public static void main(String []args){
        
        Scanner scanner = new Scanner(System.in);

        int valor = scanner.nextInt();
        int aux = valor;

        int[] notas = {100, 50, 20, 10, 5, 2, 1};
        int[] quantidadeNotas = new int[notas.length];

        for (int i = 0; i < notas.length; i++){
            quantidadeNotas[i] = aux / notas[i];
            aux = aux % notas[i]; 
        }

        System.out.println(valor);
        
        for (int i = 0; i < notas.length; i++){
            System.out.printf("%d nota(s) de R$ %d,00\n", quantidadeNotas[i], notas[i]);
        }
    }
}