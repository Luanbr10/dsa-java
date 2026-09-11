/**
 * Problema 1064 - Positivos e Média
 * Leia 6 valores. Em seguida, mostre quantos destes valores digitados foram positivos. 
 * Na próxima linha, deve-se mostrar a média de todos os valores positivos digitados, com um dígito após o ponto decimal.
 * https://judge.beecrowd.com/pt/problems/view/1064
 */

import java.util.Scanner;
import java.util.Locale;

public class PositivosMedia{
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double[] valores = new double[6];
        int contador = 0;
        double somaPositivos = 0;

        for (int i = 0; i < valores.length; i++){
            valores[i] = sc.nextDouble();
        }

        for (double num : valores){
            if (num > 0){
                contador++;
                somaPositivos += num;
            }
        }

        System.out.printf("%d valores positivos\n%.1f\n",contador, somaPositivos/contador);
    }
}