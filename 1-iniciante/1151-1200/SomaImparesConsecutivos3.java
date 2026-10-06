import java.util.Scanner;

public class SomaImparesConsecutivos3{
    public static void main(String[] args){

        try (Scanner sc = new Scanner(System.in)){
            int testes = sc.nextInt();

            for (int i = 0; i < testes; i++){

                int num = sc.nextInt();
                int qnt = sc.nextInt();
                
                if (num % 2 == 0){
                    num++;
                }

                int soma = num;

                for (int j = 1; j < qnt; j++){
                    num += 2;
                    soma += num;
                }
                
                System.out.println(soma);
            }
        }
    }
}