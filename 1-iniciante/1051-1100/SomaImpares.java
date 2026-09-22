import java.util.Scanner;

public class SomaImpares{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] somaNumeros = new int[n];
        
        for (int i = 0; i < somaNumeros.length; i++){
            
            int a = sc.nextInt();
            int b = sc.nextInt();
        
            int x = Math.max(a, b);
            int y = Math.min(a, b);

            if (Math.abs(y) % 2 == 0){
                for (int j = y+1; j < x; j += 2){
                    somaNumeros[i] += j;
                }
            }
            else{
                for (int j = y+2; j < x; j += 2){
                    somaNumeros[i] += j;
                }
            }
        }

        for (int i = 0; i < somaNumeros.length; i++){
            System.out.println(somaNumeros[i]);
        }

        sc.close();
    }
}