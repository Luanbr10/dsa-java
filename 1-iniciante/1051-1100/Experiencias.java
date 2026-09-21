import java.util.Scanner;
import java.util.Locale;

public class Experiencias{
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int totalCoelhos = 0;
        int totalRatos = 0;
        int totalSapos = 0;

        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++){

            int quantidade = sc.nextInt();
            char animal = sc.next().charAt(0);

            switch (animal){
                case 'C' -> totalCoelhos += quantidade;
                case 'R' -> totalRatos += quantidade;
                case 'S' -> totalSapos += quantidade;
            }

        }
            int total = totalRatos + totalCoelhos + totalSapos;

            double percentualCoelhos = (totalCoelhos*100.0) / total;
            double percentualRatos = (totalRatos*100.0) / total;
            double percentualSapos = (totalSapos*100.0) / total;
        

        System.out.printf("Total: %d cobaias\n",total);
        System.out.printf("Total de coelhos: %d\n",totalCoelhos);
        System.out.printf("Total de ratos: %d\n",totalRatos);
        System.out.printf("Total de sapos: %d\n",totalSapos);
        System.out.printf("Percentual de coelhos: %.2f %%\n", percentualCoelhos);
        System.out.printf("Percentual de ratos: %.2f %%\n", percentualRatos);
        System.out.printf("Percentual de sapos: %.2f %%\n", percentualSapos);


        sc.close();
    }
}