/**
 * Programa 1012 - Area
 * Um programa que faça a leitura de 3 valores, A,B e C, esses valores vão assumir determinadas formas de acordo com a necessidade. Calcular a area de circulo, trapézio, retângulo, triângulo e quadrado
 * https://judge.beecrowd.com/pt/problems/view/1012
 */

/**
 * Área quadrado => Math.pow(lado,2)
 * Área triângulo => (base*altura)/2
 * Área da Circunferência => pi*Math.pow(raio,2);
 * Área do retângulo => (base*altura)
 * Área do trapézio => ((baseMaior + baseMenor) * altura) / 2
 */

// A partir de agora, estarei usando funções sempre que possível

import java.util.Scanner;
import java.util.Locale;

public class Area{
    public static void main(String []args){

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double pi = 3.14159;

        System.out.printf("TRIANGULO: %.3f\n", areaTriangulo(a, c));
        System.out.printf("CIRCULO: %.3f\n", areaCirculo(c, pi));
        System.out.printf("TRAPEZIO: %.3f\n", areaTrapezio(a, b, c));
        System.out.printf("QUADRADO: %.3f\n", areaQuadrado(b));
        System.out.printf("RETANGULO: %.3f\n", areaRetangulo(a, b));
    }

    public static double areaTriangulo(double a, double c) {
        return (a*c)/2;
    }
    public static double areaCirculo(double c, double pi){
        return pi*Math.pow(c, 2);
    }
    public static double areaTrapezio(double a, double b, double c){
        return ((a+b) * c)/2;
    }
    public static double areaQuadrado(double b){
        return Math.pow(b, 2);
    }
    public static double areaRetangulo(double a, double b){
        return a*b;
    }
}