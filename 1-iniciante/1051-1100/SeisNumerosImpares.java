/**
 * Problema 1070 - Seis Numeros Ímpares
 * Leia um valor inteiro X. Em seguida apresente os 6 valores ímpares consecutivos a partir de X, um valor por linha, inclusive o X ser for o caso.
 * https://judge.beecrowd.com/pt/problems/view/1070
 */

import java.util.Scanner;

public class SeisNumerosImpares{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int x  = sc.nextInt();

        if (x % 2 == 0){
            x++;
        }

        for (int i = 0; i < 6; i++){
            System.out.println(x + 2 * i);
        }
    }
}