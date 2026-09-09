/**
 * Problema 1050 - DDD
 * Leia um número inteiro que representa um código de DDD para discagem interurbana. 
 * Em seguida, informe à qual cidade o DDD pertence, considerando a tabela (veja no link abaixo)
 * https://judge.beecrowd.com/pt/problems/view/1050
 */

import java.util.Scanner;

public class DDD{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int chave = sc.nextInt();

        String resposta = switch (chave){
            
            case 61 -> "Brasilia";
            case 71 -> "Salvador";
            case 11 -> "Sao Paulo";
            case 21 -> "Rio de Janeiro";
            case 32 -> "Juiz de Fora";
            case 19 -> "Campinas";
            case 27 -> "Vitoria";
            case 31 -> "Belo Horizonte";
            default -> "DDD nao cadastrado";
        };

        System.out.println(resposta);
        sc.close();
    }
}