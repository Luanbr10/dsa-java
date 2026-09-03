/**
 * Problema 1035 - Teste de Seleção 1
 * Leia 4 valores inteiros A, B, C e D. A seguir, se B for maior do que C e se D for maior do que A, e a soma de C com D for maior que a soma de A e B e se C e D, 
 * ambos, forem positivos e se a variável A for par escrever a mensagem "Valores aceitos", senão escrever "Valores nao aceitos".
 * https://judge.beecrowd.com/pt/problems/view/1035
 * 
 * Para tratar de todas as condições, por não serem tão complexas, acredito que ao invés de fazer inúmeros ifs e elses, o ideal seja manter em apenas uma linha, segue o código
 */

import java.util.Scanner;

public class TesteSelecao1{
    public static void main(String []args){

        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();


        boolean resposta = (B > C) && (D > A) && (C+D > A+B) && (C > 0 && D > 0) && (A % 2 == 0); 
        
        if(resposta){
            System.out.println("Valores aceitos");

        }
        else{
            System.out.println("Valores nao aceitos");
        }
    }
}