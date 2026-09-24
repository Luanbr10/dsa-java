import java.util.Scanner;

public class Quadrante{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;

        while(true)
        {
            a = sc.nextInt();
            b = sc.nextInt();

            if (a > 0 && b > 0){
                System.out.println("primeiro");
            }
            else if(a < 0 && b > 0){
                System.out.println("segundo");
            }
            else if(a < 0 && b < 0){
                System.out.println("terceiro");
            }
            else if(a > 0 && b < 0){
                System.out.println("quarto");
            }
            else{
                break;
            }
        }
    }
}