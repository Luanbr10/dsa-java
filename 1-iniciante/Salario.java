/**
 * Problema 1008 - Salário
 * Imprimir o número do funcionário, e o seu salário baseado na quantidade de horas trabalhadas salário = QntHoras*ValorHora;
 * https://judge.beecrowd.com/pt/problems/view/1008
 */

import java.util.Scanner;
import java.util.Locale;

public class Salario{
    public static void main(String []args){

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int numeroTrabalhador = scanner.nextInt();
        double horasTrabalhadas = scanner.nextDouble(), valorHora = scanner.nextDouble();

        double salario = horasTrabalhadas*valorHora;

        System.out.printf("NUMBER = %d\n", numeroTrabalhador);
        System.out.printf("SALARY = U$ %.2f\n", salario);
    }
}