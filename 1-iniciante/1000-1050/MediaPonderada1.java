/*
    Problema 1005 - Media 1
    Cálculo da média ponterada de dois números, na qual o número A tem peso 3.5 e o número B tem peso 7.5, totalizando 11
    https://judge.beecrowd.com/pt/problems/view/1005
 */

import java.util.Locale; // nos testes é usado '.' ao invés de ',', preciso trocar para a linguagem U.S, para a JVM conseguir intepretar
import java.util.Scanner;

public class MediaPonderada1{
    public static void main(String []args){

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double A = scanner.nextDouble();
        double B = scanner.nextDouble();

        double MEDIA = ((A*3.5)+(B*7.5)) / 11;

        System.out.printf("MEDIA = %.5f\n", MEDIA);
    }
}