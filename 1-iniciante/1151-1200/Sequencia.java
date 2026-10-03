import java.util.Locale;

public class Sequencia{
    public static void main(String[] args){
        
        Locale.setDefault(Locale.US);
        double sum = 0.0;

        for (int i = 1; i <= 100; i++){
            sum += 1.0/i;
        }

        System.out.printf("%.2f\n", sum);
    }
}