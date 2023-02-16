import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner entrada = new Scanner(System.in);
        int x = entrada.nextInt();
        double y = entrada.nextDouble();
        entrada.close();
        double consumo = x / y;
        
        System.out.printf("%.3f km/l\n", consumo);
    }
}
