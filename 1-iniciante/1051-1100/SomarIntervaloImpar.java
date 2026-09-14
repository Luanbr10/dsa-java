/**
 * Problema 1071 - Soma de Impares Consecutivos 1
 * Leia 2 valores inteiros X e Y. A seguir, calcule e mostre a soma dos números impares entre eles.
 * https://judge.beecrowd.com/pt/problems/view/1071
 */

import java.util.Scanner;
import java.util.Arrays;

public class SomaIntervaloImpar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int soma = 0;

        int x = sc.nextInt();
        int y = sc.nextInt();

        int a = Math.min(x, y);
        int b = Math.max(x, y);

        for (int i = a+1; i < b; i++){
            if (i % 2 != 0) soma += i;
        }
        System.out.println(soma);
    }
}
