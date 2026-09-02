/**
 * Problema 1016 - Distancia
 * O programa deve calcular o tempo percorrido, baseado na distância entre dois 2 carros, na qual o carro A corre à 60km/h e o B à 90km/h
 * https://judge.beecrowd.com/pt/problems/view/1016
 */

import java.util.Scanner;

public class Distancia{
    public static void main(String []args){

    Scanner scanner = new Scanner(System.in);

        int distancia = scanner.nextInt();

        System.out.printf("%d minutos\n", tempo(distancia));
    }

    public static int tempo(int distancia){
        return distancia*2;
    }
}