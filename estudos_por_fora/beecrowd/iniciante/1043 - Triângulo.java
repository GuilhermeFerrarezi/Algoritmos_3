import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner entrada = new Scanner(System.in);
        double[] x1 = new double[3];
        double[] x2 = new double[3];
        double resultado;
        for(int i = 0; i < x1.length; i++){
            x1[i] = entrada.nextDouble();
            x2[i] = x1[i];
        }
        entrada.close();
        Arrays.sort(x1);
        if (x1[0] + x1[1] > x1[2]){
            resultado = x1[0] + x1[1] + x1[2];
            System.out.printf("Perimetro = %.1f\n", resultado);
        }else{
            resultado = ((x2[0] + x2[1]) * x2[2]) / 2.0;
            System.out.printf("Area = %.1f\n", resultado);
        }
    }
}
