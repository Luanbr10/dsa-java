/**
 * Problema 1036 - Fórmula de Bhaskara
 * O programa deve calcular a formula de bhaskara, dado 3 entradas, sendo elas usadas para a ax² + bc + c, caso haja um cálculo impossível, para divisão por 0 ou raiz negativa
 * o mesmo deve printar "Impossivel calcular", caso contrário, printe o resultado com 5 dígitos após o ponto
 * https://judge.beecrowd.com/pt/problems/view/1036
 */

// Casos impossívels, A = 0 e Delta < 0;

import java.util.Scanner;
import java.util.Locale;

public class FormulaBhaskara{
    public static void main(String []args){

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();

        if (calcularDelta(A, B, C) != -1 && A != 0){
            double[] resposta = calcularBhaskara(A, B, C);

            System.out.printf("R1 = %.5f\n", resposta[0]);
            System.out.printf("R2 = %.5f\n", resposta[1]);
        }
        else{
            System.out.println("Impossivel calcular");
        }

    }

    public static double[] calcularBhaskara(double a, double b, double c){

        // bhaskara = (-b +- Math.sqrt(delta) / 2a)
        double raiz1 = (-b + Math.sqrt(calcularDelta(a, b, c))) / (2*a);
        double raiz2 = (-b - Math.sqrt(calcularDelta(a, b, c))) / (2*a);

        double[] raizes = new double[2];

        raizes[0] = raiz1;
        raizes[1] = raiz2;

        return raizes; 
    }

    public static double calcularDelta(double a, double b, double c){
        // delta = Math.pow(b, 2) - (4*a*c);
        double delta = Math.pow(b, 2) - (4*a*c);

        if (delta < 0){
            return -1;
        }
        
        return delta;
    }
}