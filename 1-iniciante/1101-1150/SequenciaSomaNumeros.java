import java.util.Scanner;

public class SequenciaSomaNumeros{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        while (true){
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (a <= 0 || b <= 0) break;

            int x = Math.max(a, b);
            int y = Math.min(a, b);
            int soma = 0;

            for (int i = y; i <= x; i++){
                soma += i;
                System.out.printf("%d ", i);
            }

            System.out.printf("Sum=%d\n", soma);
        }
    }
}