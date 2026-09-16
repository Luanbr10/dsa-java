import java.util.Scanner;

public class Resto2{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 0; i < 100; i++){
            if (i % N == 2){
                System.out.printf("%d\n", i);
            }
        }
    }
}