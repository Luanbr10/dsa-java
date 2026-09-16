import java.util.Scanner;

public class Tabuada1{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int mult = 0;

        if (num > 2 && num < 1000){
            for (int i = 1; i <= 10; i++){
                mult = i*num;
                System.out.printf("%d x %d = %d\n", i, num, mult);
            }
        }
    }
}