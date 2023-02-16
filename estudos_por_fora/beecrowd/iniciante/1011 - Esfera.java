import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner entrada = new Scanner(System.in);
        final double pi = 3.14159;
        double raio = entrada.nextDouble();
        double volume = (4.0/3) * pi * Math.pow(raio, 3);
        entrada.close();
        
        System.out.printf("VOLUME = %.3f\n", volume);
    }
}
