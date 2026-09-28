import java.util.Scanner;

public class TipoCombustivel{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int contAlcool = 0;
        int contGasolina = 0;
        int contDiesel = 0;
        int opt = 0;

        do{
            opt = sc.nextInt();

            switch (opt){
                case 1 -> contAlcool++;
                case 2 -> contGasolina++;
                case 3 -> contDiesel++;
                case 4 -> {break;}
            }

        }while (opt != 4);

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: "+contAlcool);
        System.out.println("Gasolina: "+contGasolina);
        System.out.println("Diesel: "+contDiesel);

    }
}