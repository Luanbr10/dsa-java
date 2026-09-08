/**
 * Problema 1014 - Consumo
 * O programa deve gerar o custo médio de um automóvel, dado a distância percorrida em (km) e o gasto total de combustível (L)
 * https://judge.beecrowd.com/pt/problems/view/1014
 */

import java.util.Scanner;
import java.util.Locale;

public class Consumo{
    public static void main(String []args){
        
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double kmPercorrido = scanner.nextDouble();
        double litrosGastos = scanner.nextDouble();

        double consumoMedio = calculoConsumoMedio(kmPercorrido, litrosGastos); 

        System.out.printf("%.3f km/l\n", consumoMedio);
    }

    public static double calculoConsumoMedio(double km, double litros){
        return km/litros;
    }
}