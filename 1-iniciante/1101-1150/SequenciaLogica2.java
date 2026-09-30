import java.util.Scanner;

public class SequenciaLogica2{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int sequencia = sc.nextInt();
        int tamanho = sc.nextInt();
        int contador = 0;

        for (int i = 1; i <= tamanho; i++){
            if (contador == sequencia){
                System.out.println();
                contador = 0;
            }
            if (contador > 0){
                System.out.printf(" ");
            } 
            System.out.print(i);
            contador++;
        }
        System.out.println();
    }   
}