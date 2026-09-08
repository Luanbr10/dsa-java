/**
 * Problema 1015 - Distância entre Dois Pontos
 * O programa deve ler as entradas (x1, y1) e (x2, y2) e calcular a distância entre esses dois pontos, mostrando 4 casas decimais
 * https://judge.beecrowd.com/pt/problems/view/1015
 */

import java.util.Scanner;
import java.util.Locale;

public class DistanciaDoisPontos{
    public static void main(String []args){

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        double resultadoDistancia = calcularDistacia(x1, y1, x2, y2);
        System.out.printf("%.4f\n", resultadoDistancia);

    }

    public static double calcularDistacia (double x1, double y1, double x2, double y2){
        return Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
    }
}