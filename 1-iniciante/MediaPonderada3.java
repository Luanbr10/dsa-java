/**
 * Problema 1040 - Media 3
 * 
 * Leia quatro números (N1, N2, N3, N4), cada um deles com uma casa decimal, correspondente às quatro notas de um aluno. 
 * Calcule a média com pesos 2, 3, 4 e 1, respectivamente, para cada uma destas notas e mostre esta média acompanhada pela mensagem
 * "Media: ". Se esta média for maior ou igual a 7.0, imprima a mensagem "Aluno aprovado.". Se a média calculada for inferior a 5.0, imprima a mensagem "Aluno reprovado.". 
 * Se a média calculada for um valor entre 5.0 e 6.9, inclusive estas, o programa deve imprimir a mensagem "Aluno em exame.".
 * 
 * https://judge.beecrowd.com/pt/problems/view/1040
 */


import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        // Inicialmente, fiz o uso do tipo double, porém, tive alguns problemas com o "lixo" dos números após a vírgula, fiz a substituição para o tipo float.
        // Fiz alguns testes com BigDecimal, mas não obtive êxito.

        float N1 = scanner.nextFloat() * 2.0f;
        float N2 = scanner.nextFloat() * 3.0f;
        float N3 = scanner.nextFloat() * 4.0f;
        float N4 = scanner.nextFloat() * 1.0f;

        float primeiraMedia = (N1 + N2 + N3 + N4) / 10.0f;

        if (primeiraMedia >= 7.0f) {
            System.out.printf("Media: %.1f\n", primeiraMedia);
            System.out.printf("Aluno aprovado.\n");
        }
        else if (primeiraMedia >= 5.0f) {
            System.out.printf("Media: %.1f\n", primeiraMedia);
            System.out.println("Aluno em exame.");

            float notaExame = scanner.nextFloat(); 
            System.out.printf("Nota do exame: %.1f\n", notaExame);

            float mediaFinal = (primeiraMedia + notaExame) / 2.0f;

            if (mediaFinal >= 5.0f) {
                System.out.printf("Aluno aprovado.\n");
            } else {
                System.out.printf("Aluno reprovado.\n");
            }
            System.out.printf("Media final: %.1f\n", mediaFinal);
        }
        else {
            System.out.printf("Media: %.1f\n", primeiraMedia);
            System.out.printf("Aluno reprovado.\n");
        }
        
        scanner.close(); // Boa prática: liberar recursos
    }
}