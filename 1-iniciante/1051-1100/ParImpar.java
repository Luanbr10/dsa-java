import java.util.Scanner;

public class ParImpar{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] numeros = new int[N];

        for (int i = 0; i < numeros.length; i++){
            numeros[i] = sc.nextInt();
        }

        for (int num : numeros){


            if (num == 0){
                System.out.println("NULL");
            }

            else if (num % 2 != 0){
                if (num > 0){
                    System.out.println("ODD POSITIVE");
                }
                else{
                    System.out.println("ODD NEGATIVE");
                }
            }

            else if (num % 2 == 0){
                if (num > 0){
                    System.out.println("EVEN POSITIVE");
                }
                else{
                    System.out.println("EVEN NEGATIVE");
                }
            }
        }
    }
}