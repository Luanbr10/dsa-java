/**
 * Problema 1013 - Maior
 * O programa deve ler 3 números e verificar qual é o maior deles.
 * https://judge.beecrowd.com/pt/problems/view/1013
 */

import java.util.Scanner;

public class Maior{
    public static void main(String []args){

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int aux = numeroMaior1(a, b);
        int maior = numeroMaior2(aux, c);
        
        System.out.printf("%d eh o maior\n", maior);
    }

    public static int numeroMaior1(int a, int b){
        return ((a+b) + Math.abs(a - b)) / 2;
    }

    public static int numeroMaior2(int aux, int c){
        return ((aux+c) + Math.abs(aux - c)) / 2;
    }
}