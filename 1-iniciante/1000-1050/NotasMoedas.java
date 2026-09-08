/**
 * Problema 1021 - Notas e Moedas
 * o programa deve ler um aux inteiro (0 < n < 1000000) e destrinchar o aux em questão para o menor numero de cédulas e moedas possível, entre notas de 100, 50, 20, 10, 5 e 2, moedas de 1, 0.50, 0.25, 0.10, 0.05, 0.01
 * https://judge.beecrowd.com/pt/problems/view/1021
 * demorei bastante nesse, muitos problemas com ponto flutuante, mas depois que entendi que preciso trabalhar com doubles com mais cuidado, umas vez que o sistema binário trata números de ponto flutuante de um jeito menos exato
 */

import java.util.Locale;
import java.util.Scanner;

public class NotasMoedas1{
    public static void main(String []args){

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double valor = scanner.nextDouble();

        long centavos = Math.round(valor * 100); // Operações como % e /, estava ocorrendo muitos problemas de resto de números, então decidi considerar todos os valores lidos como centavos

        int[] valorNotas = {10000, 5000, 2000, 1000, 500, 200};
        int[] valorMoedas = {100, 50, 25, 10, 5, 1};

        long[] qntNotas = new long[valorNotas.length];
        long[] qntMoedas = new long[valorMoedas.length];

        for (int i = 0; i < valorNotas.length; i++){
            qntNotas[i] = centavos / valorNotas[i];
            centavos = centavos % valorNotas[i];
        }

        for (int i = 0; i < valorMoedas.length; i++){
            qntMoedas[i] = centavos / valorMoedas[i];
            centavos = centavos % valorMoedas[i];
        }

        System.out.println("NOTAS:");
        for (int i = 0; i < qntMoedas.length; i++){
            System.out.printf("%d nota(s) de R$ %.2f\n", qntNotas[i], valorNotas[i] / 100.0);
        }


        System.out.println("MOEDAS:");
        for (int i = 0; i < qntMoedas.length; i++){
            System.out.printf("%d moeda(s) de R$ %.2f\n", qntMoedas[i], valorMoedas[i] / 100.0);
        }

    }
}