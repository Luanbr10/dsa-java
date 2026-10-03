import java.util.Scanner;

public class Fatorial{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(fatorial(n));
    }

    public static int fatorial(int n){

        if (n == 0){
            return 0;
        }

        if (n == 1){
            return 1;
        }

        return fatorial(n-1) * n;
    }
}