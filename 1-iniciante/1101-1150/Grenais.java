import java.util.Scanner;

public class Grenaiss{
    public static void main(String[] args){
        granais();
    }

    public static void granais(){
        
        Scanner sc = new Scanner(System.in);

        int contInter = 0;
        int contGremio = 0;
        int contEmpate = 0;
        int contPartidas = 0;

        outer:
        while (true){
            int inter = sc.nextInt();
            int gremio = sc.nextInt();

            if (inter > gremio){
                contInter++;
            }
            else if (gremio > inter){
                contGremio++;
            }
            else{
                contEmpate++;
            }

            contPartidas++;

            byte opt = sc.nextByte();
            System.out.println("Novo grenal (1-sim 2-nao)");
                switch (opt){
                    case 1:
                        break;

                    case 2:
                        break outer;
            }
        }

        System.out.println(contPartidas + " grenais");
        System.out.println("Inter:"+contInter);
        System.out.println("Gremio:"+contGremio);
        System.out.println("Empates:"+contEmpate);

        if (contInter > contGremio){
            System.out.println("Inter venceu mais");
            return;
        }

        System.out.println("Gremio venceu mais");
        
    }
}
