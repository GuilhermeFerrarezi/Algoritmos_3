import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner entrada = new Scanner(System.in);
        double[] x = new double[100];
        for(int i = 0; i < x.length; i++){
            x[i] = entrada.nextDouble();
            if(x[i] <= 10){
                System.out.printf("A[%d] = %.1f\n", i, x[i]);
            }
        }
        entrada.close();
    }
}
