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
        int count2 = 0;
        double[] x2 = new double[count];
        for(int i = 0; i < x.length; i++){
            if(x[i] > 0){
                x2[count2] = x[i];
                count2++;
            }
        }
        double media = 0;
        for(int i = 0; i < x2.length; i++){
            media += x2[i];
        }
        media /= x2.length;
        System.out.printf("%d valores positivos\n", count);
        System.out.printf("%.1f\n", media);
    }
}
