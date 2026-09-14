/**
 * Problema 1072 - Intervalo 2
 * Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
 * Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando essas informações.
 * https://judge.beecrowd.com/pt/problems/view/1072
 */

import java.util.Scanner;

public class IntervaloValores{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int contIn = 0;
        int contOut = 0;

        for (int i = 0; i < n; i++){
            int num = sc.nextInt();

            if (num <= 20 && num >= 10){
                contIn++;
            }
            else{
                contOut++;
            }
        }

        System.out.println(contIn + " in");
        System.out.println(contOut + " out");

    }
}