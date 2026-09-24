import java.util.Scanner;

public class CrescenteDecrescente{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        while (true){
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (a < b){
                System.out.println("Crescente");
            }
            else if (a > b){
                System.out.println("Decrescente");
            }
            else{
                break;
            }
        }
    }
}