/**
 * Problema 1041 - Coordenadas de um Ponto
 * Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas de um ponto em um plano. 
 * A seguir, determine qual o quadrante ao qual pertence o ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
 * https://judge.beecrowd.com/pt/problems/view/1041
 */

import java.util.Scanner;
import java.util.Locale;

public class CoordenadasPonto{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();
        double y = sc.nextDouble();

        int sx = (int) Math.signum(x); // retorna -1 se x < 0, 0 se x == 0 e 1 se x > 1
        int sy = (int) Math.signum(y);

        String[] resultados = {

            "Q3", "Eixo X", "Q2",
            "Eixo Y", "Origem", "Eixo Y",
            "Q4", "Eixo X", "Q1"
            // (-1, -1), (-1, 0), (-1, 1)
            // (0, -1), (0, 0), (0, 1)
            // (1, -1), (1, 0), (1, 1)
        };

        System.out.println(resultados[(sx + 1) * 3 + (sy + 1)]);       

    }
}