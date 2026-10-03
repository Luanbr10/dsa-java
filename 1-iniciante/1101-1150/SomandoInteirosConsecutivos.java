import java.util.Scanner;

public class SomandoInteirosConsecutivos{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int aux = a;
        int n = 0;

        while (true){
            n = sc.nextInt();

            if (n > 0) {break;}
        }

        for (int i = 0; i < n - 1; i++){
            a += aux + i;
            a++;
        }

        System.out.println(a);
    }
}