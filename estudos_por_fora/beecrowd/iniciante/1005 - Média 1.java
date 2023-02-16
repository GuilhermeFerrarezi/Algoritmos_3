import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner entrada = new Scanner(System.in);
        double a = entrada.nextDouble();
        double b = entrada.nextDouble();
        double media = ((a * 3.5) + (b * 7.5))/11;
        entrada.close();
        System.out.printf("MEDIA = %.5f\n", media);
    }
}
