import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner entrada = new Scanner(System.in);
        double[] x = new double[100];
        x[0] = entrada.nextDouble();
        entrada.close();
        for(int i = 1; i < x.length; i++){
            x[i] = x[i-1] / 2;
        }
        for(int i = 0; i< x.length; i++){
            System.out.printf("N[%d] = %.4f\n", i, x[i]);
        }
    }
}
