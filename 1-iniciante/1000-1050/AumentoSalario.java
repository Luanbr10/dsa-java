/**
 * Problema 1048 - Aumento de Salário
 * A empresa ABC resolveu conceder um aumento de salários a seus funcionários de acordo com a tabela abaixo (melhor ver diretamente no problema):
 * Leia o salário do funcionário e calcule e mostre o novo salário, bem como o valor de reajuste ganho e o índice reajustado, em percentual.
 * https://judge.beecrowd.com/pt/problems/view/1048
 */

import java.util.Scanner;
import java.util.Locale;

public class AumentoSalario{
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double salario = sc.nextDouble();
        double reajuste = 0;
        double porcentagem = 0;
        char percento = '%';

        if (salario >= 0 && salario <= 400.00){
            porcentagem = 0.15;
            reajuste = salario * porcentagem;
        }

        else if (salario >= 400.01 && salario <= 800.00){
            porcentagem = 0.12;
            reajuste = salario * porcentagem;
        }

        else if (salario >= 800.01 && salario <= 1200.00){
            porcentagem = 0.10;
            reajuste = salario * porcentagem;
        }

        else if (salario >= 1200.01 && salario <= 2000.00){
            porcentagem = 0.07;
            reajuste = salario * porcentagem;
        }

        else if (salario >= 2000.00){
            porcentagem = 0.04;
            reajuste = salario * porcentagem;

        }
        double salarioNovo = salario+reajuste;

        System.out.printf("Novo salario: %.2f\n", salarioNovo);
        System.out.printf("Reajuste ganho: %.2f\n", reajuste);
        System.out.printf("Em percentual: %.0f %c\n", porcentagem*100, percento);

        sc.close();
    }   
}