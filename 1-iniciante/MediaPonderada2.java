/*
    Problema 1006 - Media 2
    Calcular a média ponderada de 3 números, A peso 2, B peso 3 e C peso 5;
    https://judge.beecrowd.com/pt/problems/view/1006
 */

import java.util.Scanner;
import java.util.Locale;

public class MediaPonderada2{
    public static void main(String []args){

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double MEDIA = ((a*2)+(b*3)+(c*5)) / 10;

        System.out.printf("MEDIA = %.1f\n", MEDIA);

    }
}