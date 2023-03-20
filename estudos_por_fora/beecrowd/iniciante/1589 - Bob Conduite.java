import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner entrada = new Scanner(System.in);
        int t = entrada.nextInt();
        int r1 = 0, r2 = 0;
        while(t > 0){
            r1 = entrada.nextInt();
            r2 = entrada.nextInt();
            System.out.println(r1 + r2);
            t--;
        }
        entrada.close();
    }
}
