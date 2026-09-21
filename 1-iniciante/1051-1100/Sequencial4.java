import java.util.Locale;

public class Sequencial4{
    public static void main(String[] args){

        Locale.setDefault(Locale.US);

        for (double i = 0.0; i <= 2.0; i += 0.2){

            for (double j = 1.0 + i; j <= 3.0 + i; j++){

                if (Math.abs(i - Math.round(i)) < 0.00001){
                    System.out.printf("I=%.0f J=%.0f\n", i, j);
                }
                else{
                    System.out.printf("I=%.1f J=%.1f\n", i, j);
                }
            }
        }
    }
}