import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
         Scanner entrada = new Scanner(System.in);
         double pi = 3.14159;
         double area;
         double raio;
         raio = entrada.nextDouble();
         area = pi * Math.pow(raio, 2);
        		 
         entrada.close();
        
         System.out.printf("A=%.4f\n", area);
    }
}
