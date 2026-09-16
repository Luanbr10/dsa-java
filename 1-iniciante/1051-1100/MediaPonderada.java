import java.util.Scanner;
import java.util.Locale;

public class MediaPonderada{
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double numeros[][] = new double[n][3];
        double resultados[] = new double[numeros.length];

        for (int i = 0; i < numeros.length; i++){
            for (int j = 0; j < numeros[i].length; j++){
                numeros[i][j] = sc.nextDouble();

                if (j == 0){
                    numeros[i][j] *= 2;
                }

                else if (j == 1){
                    numeros[i][j] *= 3;
                }
                else if (j == 2){
                    numeros[i][j] *= 5;
                }
                resultados[i] += numeros[i][j];
            }
            resultados[i] /= 10;
        }

        for (int i = 0; i < resultados.length; i++){
            System.out.printf("%.1f\n", resultados[i]);
        }
    }
}