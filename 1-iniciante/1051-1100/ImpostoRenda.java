/**
 * Problema 1051 - Imposto de Renda
 * Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. 
 * Em seguida, calcule e mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela (veja entrando no link abaixo).
 * https://judge.beecrowd.com/pt/problems/view/1051
 */

import java.util.Scanner;
import java.util.Locale;

public class ImpostoRenda{
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double salario = sc.nextDouble();

        double imposto1 = 0.0;
        double imposto2 = 0.0;
        double imposto3 = 0.0;
        double impostoTotal = 0.0;


        if (salario >= 0.0 && salario <= 2000.00){
            System.out.println("Isento");
            return;
        }

        else if (salario >= 2000.01 && salario <= 3000.00){
            imposto1 = (salario - 2000.00) * 0.08;

            impostoTotal = imposto1;
        }

        else if (salario >= 3000.01 && salario <= 4500.00){

            imposto1 = 1000.00 * 0.08;
            imposto2 = (salario - 3000.00) * 0.18;

            impostoTotal = imposto1 + imposto2;
        }

        else if(salario >= 4500.01){
            imposto1 = 1000.00 * 0.08;
            imposto2 = 1500.00 * 0.18;
            imposto3 = (salario - 4500.00) * 0.28;

            impostoTotal = imposto1 + imposto2 + imposto3;
        }

        System.out.printf("R$ %.2f\n", impostoTotal);
        sc.close();
    }
}