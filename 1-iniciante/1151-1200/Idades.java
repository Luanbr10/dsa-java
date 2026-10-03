import java.util.Scanner;
import java.util.Locale;

public class Idades{
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        
        double sum = 0;
        double cont = 0;
        double num = 0;

        try (Scanner sc = new Scanner(System.in)){
            while (true){
                num = sc.nextInt();

                if (num < 0){
                    break;
                }
            
                sum += num;
                cont++;
            }

            double valor = sum/cont;
            System.out.printf("%.2f\n", valor);
        }
    }
}