import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner entrada = new Scanner(System.in);
        int qtd_grenais = 0, v_gremio = 0, v_inter = 0, empates = 0, g_gremio = 0, g_inter = 0, repete = 1;
        
        while(repete == 1){
            g_inter = entrada.nextInt();
            g_gremio = entrada.nextInt();
            qtd_grenais++;
            if(g_gremio > g_inter){
                v_gremio++;
            }else if(g_inter > g_gremio){
                v_inter++;
            }else{
                empates++;
            }
            repete = 0;
            while(repete != 1 && repete != 2){
                System.out.println("Novo grenal (1-sim 2-nao)");
                repete = entrada.nextInt();
            }
        }
        entrada.close();
        System.out.printf("%d grenais\n", qtd_grenais);
        System.out.printf("Inter:%d\n", v_inter);
        System.out.printf("Gremio:%d\n", v_gremio);
        System.out.printf("Empates:%d\n", empates);
        if(v_inter > v_gremio){
            System.out.println("Inter venceu mais");
        }else if(v_gremio > v_inter){
            System.out.println("Gremio venceu mais");
        }else{
            System.out.println("Nao houve vencedor");
        }
    }
}
