/**
 * Problema 1046 - Tempo de Jogo
 * Leia a hora inicial e a hora final de um jogo. 
 * A seguir calcule a duração do jogo, sabendo que o mesmo pode começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
 * https://judge.beecrowd.com/pt/problems/view/1046
 */

import java.util.Scanner;

public class TempoJogo{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int hInicial = sc.nextInt();
        int hFinal = sc.nextInt();

        int duracao = hInicial - hFinal;

        if (duracao <= 0){
            duracao += 24;
        }

        System.out.printf("O JOGO DUROU %d HORA(S)\n", duracao);

        sc.close();
    }
}