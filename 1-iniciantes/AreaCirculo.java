/* 
    Problema 1002 - Area do Circulo
    Cálcular a área de uma circunferencia
    https://judge.beecrowd.com/pt/problems/view/1002

*/

import java.util.Scanner;
import java.util.Locale;

public class AreaCirculo{
    public static void main(String []args){

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double raio = scanner.nextDouble();
        double pi = 3.14159;

        double area = pi*Math.pow(raio, 2);

        System.out.printf("A=%.4f\n", area);
    }
}