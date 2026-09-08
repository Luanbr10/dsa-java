/**
 * Problema 1043 - Triangulo
 * Leia 3 valores reais (A, B e C) e verifique se eles formam ou não um triângulo. Em caso positivo, calcule o perímetro do triângulo e apresente a mensagem:
 * 
 * 
    Perimetro = XX.X
    
    Em caso negativo, calcule a área do trapézio que tem A e B como base e C como altura, mostrando a mensagem

    Area = XX.X
    https://judge.beecrowd.com/pt/problems/view/1043
 */

import java.util.Scanner;
import java.util.Locale;

public class Triangulo{
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);    

        double A = 0, B = 0, C = 0;

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        if (verificarTriangulo(A, B, C) == 1){
            double perimetroTriangulo = A+B+C;
            System.out.printf("Perimetro = %.1f\n", perimetroTriangulo);
        }
        else{
            double areaTrapezio = ((A+B)*C)/2;
            System.out.printf("Area = %.1f\n", areaTrapezio);

        }
    }
    public static double verificarTriangulo(double a, double b, double c){
        if (a < b+c){
            if (b < a+c){
                if (c < a+b){
                    return 1;
                }
            }
        }
        return 0;
    }
}