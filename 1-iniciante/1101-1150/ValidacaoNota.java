import java.util.Scanner;
import java.util.Locale;

public class ValidacaoNota{
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        calcularNota();
    }

    public static void calcularNota(){
        int notasValidas = 0;
        double sumNotas = 0;

        try (Scanner sc = new Scanner(System.in)){
            while(true){

                if (notasValidas == 2){
                    System.out.println("media = "+sumNotas/2.0);
                    break;
                }

                double nota = sc.nextDouble();

                if (nota >= 0.0 && nota <= 10.0){
                    sumNotas += nota;
                    notasValidas++;
                    continue;
                }

                System.out.println("nota invalida");
            }
        } catch(Exception e){

        }
    
    }
}