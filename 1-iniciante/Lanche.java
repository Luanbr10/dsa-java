/**
 * Problema 1038 - Lanche
 * o programa deve ler o código de um item e a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.
 * https://judge.beecrowd.com/pt/problems/view/1038
 */

import java.util.Scanner;

public class Lanche{
    public static void main(String []args){

        Scanner scanner = new Scanner(System.in);

        int opcao = scanner.nextInt();
        int quantidade = scanner.nextInt();
        double valorFinal = 0;

        switch (opcao){
            case 1:
                valorFinal = quantidade * 4.00;
                System.out.printf("Total: R$ %.2f\n", valorFinal);
                break;

            case 2:
                valorFinal = quantidade * 4.50;
                System.out.printf("Total: R$ %.2f\n", valorFinal);
                break;

            case 3:
                valorFinal = quantidade * 5.00;
                System.out.printf("Total: R$ %.2f\n", valorFinal);
                break;                

            case 4:
                valorFinal = quantidade * 2.00;
                System.out.printf("Total: R$ %.2f\n", valorFinal);
                break;

            case 5:
                valorFinal = quantidade * 1.50;
                System.out.printf("Total: R$ %.2f\n", valorFinal);
                break;

        }
    }
}