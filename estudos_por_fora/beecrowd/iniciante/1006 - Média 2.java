import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner entrada = new Scanner(System.in);
        double a = entrada.nextDouble();
        double b = entrada.nextDouble();
        double c = entrada.nextDouble();
        double media = ((a * 2) + (b * 3) + (c * 5))/10;
        entrada.close();
        System.out.printf("MEDIA = %.1f\n", media);
    }
}
