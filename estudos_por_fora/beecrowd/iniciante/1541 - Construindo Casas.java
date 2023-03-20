import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner entrada = new Scanner(System.in);
        double a = entrada.nextDouble();
        double b, c, x;
        while (a != 0) {
        	b = entrada.nextInt();
        	c = entrada.nextInt();
        	x = Math.sqrt((((a * b) / c) * 100.0));
        	System.out.println((int)x);
        	a = entrada.nextDouble();
        }
        entrada.close();
    }
}
