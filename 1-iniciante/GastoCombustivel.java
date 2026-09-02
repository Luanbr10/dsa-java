/**
 * Problema 1017 - Gasto de Combustível
 * O programa deve calcular a quantidade de combustível necessário para concluir a viagem, dado as seguintes informações. 
 * 12 km/l - quantidade de litro gasto por km, qntHoras percurso e velocidade média em km/h. Resultado com 3 casas decimas;
 * https://judge.beecrowd.com/pt/problems/view/1017
 */

import java.util.Scanner;

public class GastoCombustivel{
    public static void main(String []args){

        Scanner scanner = new Scanner(System.in);

        double horasPercurso = scanner.nextDouble();
        double kmHora = scanner.nextDouble();

        System.out.printf("%.3f\n", calculoLitros(horasPercurso, kmHora));
    } 

    public static double calculoLitros(double horas, double km){
        return (horas*km) / 12; // 12 sendo o gasto de km por litro
    }
}