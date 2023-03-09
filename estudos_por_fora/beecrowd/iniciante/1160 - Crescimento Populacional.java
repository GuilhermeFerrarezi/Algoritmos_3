import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner entrada = new Scanner(System.in);
        int t = entrada.nextInt();
        int pa = 0, pb = 0, anos = 0;
        double g1 = 0, g2 = 0;
        while(t > 0){
            anos = 0;
            pa = entrada.nextInt();
            pb = entrada.nextInt();
            g1 = entrada.nextDouble();
            g2 = entrada.nextDouble();
            t--;
            for(; pa <= pb; anos++){
                pa += pa * (g1 / 100);
                pb += pb * (g2 / 100);
                if(anos > 100){
                    break;
                }
            }
            if(anos > 100){
                System.out.println("Mais de 1 seculo.");
            }else{
                System.out.printf("%d anos.\n", anos);
            }
        }
        entrada.close();
    }
}
