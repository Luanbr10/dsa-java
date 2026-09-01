/**
 * Problema 1011 - Esfera
 * Um programa que cálcule o volume de uma esfera dado apenas o Raio. Cálculo do volume de uma esfera eh V = 4/3 * pi * pow(raio,3) com 3 casas decimais
 * https://judge.beecrowd.com/pt/problems/view/1011
 */

import java.util.Scanner;

public class VolumeEsfera{
    public static void main(String []args){

        Scanner scanner = new Scanner(System.in);
        
        double raio = scanner.nextDouble();
        double volume = (4.0/3 * 3.14159 * Math.pow(raio, 3));

        System.out.printf("VOLUME = %.3f\n", volume);
    }
}