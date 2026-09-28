import java.util.Scanner;

public class Multiplos13{
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

        int sum = sumNaoMultiplo(maior, menor);
        System.out.println(sum);
    }

    public static int sumNaoMultiplo(int maior, int menor){
        int sum = 0;
        for (int i = menor; i <= maior; i++){
            if (i % 13 != 0){
                sum += i;
            }
        }

        return sum;
    }
}