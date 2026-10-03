import java.util.Scanner;

public class SequenciaFibonacci{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        fibonacci(n);
    }
    public static void fibonacci(int n){

        int anterior = 0;
        int atual = 1;
        int proximo = 0;

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++){
            sb.append(anterior);

            proximo = anterior + atual;
            anterior = atual;
            atual = proximo;

            if (i != n-1){sb.append(" ");}
        }

        System.out.println(sb);
    }
}