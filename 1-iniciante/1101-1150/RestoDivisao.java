import java.util.Scanner;

public class RestoDivisao{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int maior = 0;
        int menor = 0;

        if (a > b){
            maior = a;
            menor = b;
        }
            maior = b;  
            menor = a;
        

        for (int i = menor; i < maior; i++){
            if ((Math.abs(i) % 5 == 2) || (Math.abs(i) % 5 == 3)){
                System.out.println(i);
            }
        }
    }
}