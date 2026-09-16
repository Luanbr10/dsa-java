import java.util.Scanner;
import java.util.ArrayList;

public class MaiorPosicao{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int maior = 0;
        int indice = 0;
        
        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 100; i++){
            int valor = sc.nextInt();
            numeros.add(valor);
        }

        maior = numeros.get(0);

        for (Integer numero : numeros){
            if (maior < numero){
                indice = numeros.indexOf(numero);
                maior = numero;
            }
        }

        System.out.println(maior);
        System.out.println(indice+1);

    }
}