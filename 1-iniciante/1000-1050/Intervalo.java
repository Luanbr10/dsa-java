/**
 * Problema 1037 - Intervalo
 * o programa deve ler um valor e apresentar o intervalo que aquele número se enquadra, caso esteja fora do intervalo de 0-100, o mesmo deve imprimir a mensagem
 * "Fora de intervalo", caso contrário, pode ser [0,25], [25,50], [50,75], [75,100]
 * https://judge.beecrowd.com/pt/problems/view/1037
 */

import java.util.Locale;
import java.util.Scanner;

public class Intervalo{
    public static void main(String []args){

        Scanner scanner = new Scanner(System.in);

        double valor = scanner.nextDouble();

        if (valor >= 0 && valor <= 25){
            System.out.println("Intervalo (0, 25]");
        }

        else if (valor >= 25 && valor <= 50){
            System.out.println("Intervalo (25, 50]");
        }

        else if (valor >= 50 && valor <= 25){
            System.out.println("Intervalo (50, 75]");
        }

        else if (valor >= 75 && valor <= 100){
            System.out.println("Intervalo (75, 100]");
        }

        else{
            System.out.println("Fora de intervalo");
        }
    
    }
}