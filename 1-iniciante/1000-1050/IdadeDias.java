/**
 * Problema 1020 - Idade em Dias
 * O programa deve ler uma entrada em dias, e separar em ano(s), mes(es) e dia(s)
 * https://judge.beecrowd.com/pt/problems/view/1020
 */

import java.util.Scanner;

public class IdadeDias{
    public static void main(String []args){

        Scanner scanner = new Scanner(System.in);

        int idadeDias = scanner.nextInt();
        int aux = idadeDias;

        int[] vetorDias = {365, 30, 1}; // vetorDias[0] - qntDias no mês vetorDias[1] qntDias no ano;
        int[] vetorIdade = new int[3];

        for (int i = 0; i < vetorDias.length; i++){
            vetorIdade[i] = aux / vetorDias[i];
            aux = aux % vetorDias[i];
        }

        System.out.printf("%d ano(s)\n",vetorIdade[0]);
        System.out.printf("%d mes(es)\n",vetorIdade[1]);
        System.out.printf("%d dia(s)\n",vetorIdade[2]);

    }
}