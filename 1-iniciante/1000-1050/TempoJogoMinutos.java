/**
 * Problema 1047 - Tempo de Jogo com Minutos
 * Leia a hora inicial, minuto inicial, hora final e minuto final de um jogo. A seguir calcule a duração do jogo.
 * Obs: O jogo tem duração mínima de um (1) minuto e duração máxima de 24 horas.
 * https://judge.beecrowd.com/pt/problems/view/1047
 */

import java.util.Scanner;

public class TempoJogoMinutos{
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int horaInicial = sc.nextInt();
        int minutoInicial = sc.nextInt();
        int horaFinal = sc.nextInt();
        int minutoFinal = sc.nextInt();

        int inicio = horaInicial * 60 + minutoInicial;
        int fim = horaFinal * 60 + minutoFinal;

        int duracao = fim - inicio;

        if (duracao <= 0){
            duracao += 1440;
        }

        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", duracao/60, duracao % 60);
        sc.close();
    }
}
