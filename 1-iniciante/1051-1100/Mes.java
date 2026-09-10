/**
 * Problema 1052 - Mês
 * Leia um valor inteiro entre 1 e 12, inclusive. 
 * Correspondente a este valor, deve ser apresentado como resposta o mês do ano por extenso, em inglês, com a primeira letra maiúscula.
 * https://judge.beecrowd.com/pt/problems/view/1052
 */
import java.util.Scanner;

public class Mes{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int chave = sc.nextInt();
        String resposta = switch (chave){
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12-> "December";
            default -> "";
        };
        System.out.println(resposta);
    }
}