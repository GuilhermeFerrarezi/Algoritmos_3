import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner entrada = new Scanner(System.in);
        int a, b, x;
        
        a = entrada.nextInt();
        b = entrada.nextInt();
        entrada.close();
        x = a + b;
        
        System.out.println("X = " + x);
    }
}
