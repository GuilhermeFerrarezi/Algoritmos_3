import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner entrada = new Scanner(System.in);
        int n = entrada.nextInt();
        entrada.close();
        for(int i = 1; i <= n; i++){
            if(i % 2 == 0){
                System.out.printf("%d^2 = %.0f\n", i, Math.pow(i, 2));
            }
        }
    }
}
