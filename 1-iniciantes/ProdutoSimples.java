/*
    Problema 1004 - Produto Simples
    Exibir o produto de 2 números, com a mensagem "PROD = valor"
    https://judge.beecrowd.com/pt/problems/view/1004
 */

import java.util.Scanner;

public class ProdutoSimples{
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int PROD = a*b;

        System.out.printf("PROD = %d\n", PROD);
    }
}