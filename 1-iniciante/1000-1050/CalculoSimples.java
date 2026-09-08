/**
 * Problema 1010 - Cálculo SImples
 * O programa deve ler 3 entradas (codigoPeca, qntPeca, valorUnitario) duas vezes, ou seja, 2 produtos diferentes e retornar o valor final
 * https://judge.beecrowd.com/pt/problems/view/1010
 */

import java.util.Scanner;
import java.util.Locale;

public class CalculoSimples{
    public static void main(String []args){

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double somaTotal = 0;

        for (int i = 0; i < 2; i++){
        
        scanner.nextInt(); // codigo da peça, não utilizado no cálculo
        
        int qntPeca = scanner.nextInt();
        double valorUnitario = scanner.nextDouble();

        double subtotal = valorUnitario*qntPeca;

        somaTotal += subtotal;
        }

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", somaTotal);

    }
}