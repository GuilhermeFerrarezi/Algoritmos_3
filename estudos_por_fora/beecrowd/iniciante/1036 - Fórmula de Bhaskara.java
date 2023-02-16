import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner entrada = new Scanner(System.in);
        double a = entrada.nextDouble();
        double b = entrada.nextDouble();
        double c = entrada.nextDouble();
        entrada.close();
        double delta;
        double x1, x2;
        
        delta = Math.pow(b, 2) - (4*a*c);
        if (delta < 0 || a == 0){
            System.out.println("Impossivel calcular");
        }else{
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.printf("R1 = %.5f\nR2 = %.5f\n", x1, x2);
        }
    }
}
