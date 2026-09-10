/**
 * Problema 1061 - Tempo de um Evento
 * O programa deve calcular o tempo de duração de um evento dado dia,hora,minuto,segundo inicial e os mesmos dados, finais.
 * https://judge.beecrowd.com/pt/problems/view/1061
 */

import java.util.Scanner;

public class TempoEvento{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        // o numero ao lado da variável, é para identificar o início (1) e final (2);
        sc.next(); // eu não vou usar o valor "Dia" então não faz sentido guardar em uma variável;

        int w1 = sc.nextInt();
        int x1 = sc.nextInt(); 
        sc.next(); // a mesma ideia do "Dia", vale para o ':';
        int y1 = sc.nextInt();
        sc.next();
        int z1 = sc.nextInt();

        sc.next();

        int w2 = sc.nextInt();
        int x2 = sc.nextInt(); 
        sc.next();
        int y2 = sc.nextInt();
        sc.next();
        int z2 = sc.nextInt();

        int inicio = (w1 * 86400) + (x1 * 3600) + (y1 * 60) + z1;
        int fim = (w2 * 86400) + (x2 * 3600) + (y2 * 60) + z2;
        int duracao = fim - inicio;


        System.out.printf("%d dia(s)\n", duracao / 86400);
        System.out.printf("%d hora(s)\n", duracao % 86400 / 3600);
        System.out.printf("%d minuto(s)\n", duracao % 3600 / 60);
        System.out.printf("%d segundo(s)\n", duracao % 60);
    }
}