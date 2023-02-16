import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        
        double[] x = new double[6];
        int count = 0;
        Scanner entrada = new Scanner(System.in);
        for(int i = 0; i < x.length; i++){
            x[i] = entrada.nextDouble();
            if (x[i] > 0){
                count++;
            }
        }
        entrada.close();
        System.out.printf("%d valores positivos\n", count);
    }
}
