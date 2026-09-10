/**
 * Problema 1060 - Numeros Positivos7
 * Faça um programa que leia 6 valores.
 * Estes valores serão somente negativos ou positivos (desconsidere os valores nulos). A seguir, mostre a quantidade de valores positivos digitados.
 * https://judge.beecrowd.com/pt/problems/view/1060
 */

import java.util.Scanner;
import java.util.Locale;

public class NumerosPositivos{
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double[] valores = new double[6];
        int contador = 0;


        for (int i = 0; i < valores.length; i++){
            valores[i] = sc.nextDouble();
        }

        for (double num : valores){
            if (num > 0){
                contador++;
            }
        }
        
        if (contador > 0) System.out.printf("%d valores positivos\n", contador);
    }
}