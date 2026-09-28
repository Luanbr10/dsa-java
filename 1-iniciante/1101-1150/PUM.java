import java.util.Scanner;

public class PUM{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int PUM = 1;

        for (int i = 0; i < N; i++){
            for (int j = PUM; j < (PUM+3); j++){
                System.out.printf("%d ", j);
            }
            System.out.println("PUM");
            PUM += 4;
        }
    }
}