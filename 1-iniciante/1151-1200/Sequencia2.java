public class Sequencia2{
    public static void main(String[] args){

        double soma = 1;
        double denominador = 2;

        for (int i = 1; i <= 39; i++){
            soma += (i+2)/(denominador*2);
            denominador *= 2;
        }
        System.out.printf("%.2f\n", soma*2);

    }
}