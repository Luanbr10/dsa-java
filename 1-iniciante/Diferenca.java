/**
 *  Problema 1007 - Diferença
 *  Imprimir a diferença entre 2 conjuntos de númeoros, (a*b) - (c*d)
 *  https://judge.beecrowd.com/pt/problems/view/1007
 */

import java.util.Scanner;

public class Diferenca{
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        int DIFERENCA = (a*b) - (c*d);

        System.out.printf("DIFERENCA = %d\n", DIFERENCA);

    }
}