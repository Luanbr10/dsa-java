/**
 * Problema 1009 - Salário com Bônus
 * Um programa que leia o nome do vendedor, seu salário fixo e o total de vendas feitas por ele no mês, sabendo que ele
 * ganha 15% de comissão sobre suas vendas, o valor final com duas casas decimais.
 * https://judge.beecrowd.com/pt/problems/view/1009
 */

import java.util.Scanner;
import java.util.Locale;

public class SalarioBonus{
    public static void main(String []args){

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        String nomeVendedor = scanner.nextLine();
        double salarioFixo = scanner.nextDouble(), valorVendas = scanner.nextDouble();

        double salarioTotal = salarioFixo + (valorVendas*0.15);
        System.out.printf("TOTAL = R$ %.2f\n", salarioTotal);
    }
}