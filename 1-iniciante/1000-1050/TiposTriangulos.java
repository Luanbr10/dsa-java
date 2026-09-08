/**
 * Problema 1045 - Tipos de Triângulos
 * Leia 3 valores de ponto flutuante A, B e C e ordene-os em ordem decrescente, 
 * de modo que o lado A representa o maior dos 3 lados. A seguir, determine o tipo de triângulo que estes três lados formam, com base nos seguintes casos, sempre escrevendo uma mensagem adequada:
 * se A ≥ B+C, apresente a mensagem: NAO FORMA TRIANGULO
 * se A2 = B2 + C2, apresente a mensagem: TRIANGULO RETANGULO
 * se A2 > B2 + C2, apresente a mensagem: TRIANGULO OBTUSANGULO
 * se A2 < B2 + C2, apresente a mensagem: TRIANGULO ACUTANGULO
 * se os três lados forem iguais, apresente a mensagem: TRIANGULO EQUILATERO
 * se apenas dois dos lados forem iguais, apresente a mensagem: TRIANGULO ISOSCELES
 * https://judge.beecrowd.com/pt/problems/view/1045
 */

import java.util.Scanner;
import java.util.Locale;
import java.util.Arrays;

public class TiposTriangulos{
    
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        double[] numeros = new double[3];
        for (int i = 0; i < numeros.length; i++){
            numeros[i] = sc.nextDouble();
        }

        Arrays.sort(numeros);
        String[] respostas = new String[6];

        verificarTriangulo(numeros[2], numeros[1], numeros[0], respostas);

        for (int i = 0; i < respostas.length; i++){
            if (respostas[i] != null){
                System.out.println(respostas[i]);
            }
        }
        sc.close();
    }

    public static void verificarTriangulo(double a, double b, double c, String[] respostas){
        if (a >= (b+c)){
            respostas[0] = "NAO FORMA TRIANGULO";
            return;
        }

        if (Math.pow(a, 2) == (Math.pow(b, 2) + Math.pow(c,2))){
            respostas[1] = "TRIANGULO RETANGULO";
        }

        if (Math.pow(a, 2) > (Math.pow(b, 2) + Math.pow(c, 2))){
            respostas[2] = "TRIANGULO OBTUSANGULO";
        }

        if (Math.pow(a, 2) < (Math.pow(b,2) + Math.pow(c, 2))){
            respostas[3] = "TRIANGULO ACUTANGULO";
        }

        if (a == b && b == c && a == c){
            respostas[4] = "TRIANGULO EQUILATERO";
        }

        if ((a == b || b == c || a == c) && respostas[4] == null){
            respostas[5] = "TRIANGULO ISOSCELES";
        }
    }
}