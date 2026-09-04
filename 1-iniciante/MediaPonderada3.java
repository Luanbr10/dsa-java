/**
 * Problema 
 */


import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

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