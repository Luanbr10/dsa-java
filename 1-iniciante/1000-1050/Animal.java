/**
 * Problema 1049 - Animal
 * Neste problema, você deverá ler 3 palavras que definem o tipo de animal possível segundo o esquema abaixo, da esquerda para a direita.  
 * Em seguida conclua qual dos animais seguintes foi escolhido, através das três palavras fornecidas.
 * https://judge.beecrowd.com/pt/problems/view/1049
 */

import java.util.Scanner;

public class Animal{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String chave = sc.next() + " " + sc.next() + " " + sc.next();

        String resposta = switch (chave){
            case "vertebrado ave carnivoro" -> "aguia";
            case "vertebrado ave onivoro" -> "pomba";
            case "vertebrado mamifero onivoro" -> "homem";
            case "vertebrado mamifero herbivoro" -> "vaca";
            case "invertebrado inseto herbivoro" -> "lagarta";
            case "invertebrado inseto hematofago" -> "pulga";
            case "invertebrado anelideo onivoro" -> "minhoca";
            case "invertebrado anelideo hematofago" -> "sanguessuga";
            default -> "";
        };
        System.out.println(resposta);
        sc.close();
    }
}