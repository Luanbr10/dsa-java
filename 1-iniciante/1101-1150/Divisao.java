import java.util.Scanner;

public class Divisao{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            double a = sc.nextDouble();
            double b = sc.nextDouble();

            divisao(a, b);
        }

    }

    public static void divisao(double a, double b){
        if (a == 0){
            System.out.println("0.0");
        }
        else if(b == 0){
            System.out.println("divisao impossivel");
        }
        else{
            System.out.println(a/b);
        }
    }
}