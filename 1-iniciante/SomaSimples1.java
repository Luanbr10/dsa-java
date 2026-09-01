/*
    Problema 1001 - Extremamente Básico
    Imprimir a soma de 2 valores (a,b) na variável X
    https://judge.beecrowd.com/pt/problems/view/1001
 */
import java.util.Scanner;

public class Sum{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int x = a+b;
        System.out.printf("X = %d\n", x);
    }
}