import java.util.Scanner;

public class UltrapassandoZ{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int aux = a;

        int z = 0;
        int cont = 0;

        while (true){
            z = sc.nextInt();

            if (z > a) { break; }
        }

        while (true){
            if (a > z){
                break;
            }
            a += aux + 1;
            cont++;
        }        
        
        System.out.println(cont);
    }
}