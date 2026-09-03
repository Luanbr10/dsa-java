/**
 * Problema 1019 - Conversão de Tempo
 * O programa deve ler a entrada em segundos, e organizar em hora(s), minuto(s) e segundo(s) (0:0:0)
 * https://judge.beecrowd.com/pt/problems/view/1019
 */

import java.util.Scanner;

public class ConversaoTempo{
    public static void main(String []args){

        Scanner scanner = new Scanner(System.in);

        int tempo = scanner.nextInt();

        int[] vetorParametros = {60, 3600};
        int[] vetorTempo = new int[3];

        vetorTempo[0] = tempo % vetorParametros[0];

        for (int i = 1; i <= 2; i++){
            vetorTempo[i] = tempo / vetorParametros[i-1] % 60;
        }

        System.out.printf("%d:%d:%d\n", vetorTempo[2], vetorTempo[1], vetorTempo[0]);

    }
}