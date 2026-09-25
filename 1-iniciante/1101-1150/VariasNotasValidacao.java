import java.util.Scanner;
import java.util.Locale;

public class VariasNotasValidacao{
    public static void main(String[] args){

        Locale.setDefault(Locale.US);

        calcularNotas();
    }

    public static void calcularNotas(){

        try (Scanner sc = new Scanner(System.in)){
            
            int notasValidas = 0;
            double sumNotas = 0;


            while (true){

                if (notasValidas == 2){
                    System.out.printf("media = %.2f\n", sumNotas/2.0);

                    outer:
                    while (true){
                        System.out.printf("novo calculo (1-sim 2-nao)\n");
                        byte opt = sc.nextByte();

                        switch (opt){
                            case 1:
                                notasValidas = 0;
                                sumNotas = 0;
                                break outer;
                            
                            case 2:
                                return;
                        }
                    }
                }

                double nota = sc.nextDouble();

                if (!(nota >= 0.0 && nota <= 10.0)){
                    System.out.println("nota invalida");
                    continue;
                }

                sumNotas += nota;
                notasValidas++;
            }
        }
    }
}