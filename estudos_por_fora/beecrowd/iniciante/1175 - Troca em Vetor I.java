import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner entrada = new Scanner(System.in);
        int[] x = new int[20];
        
        for(int i = 0; i < x.length; i++){
            x[i] = entrada.nextInt();
        }
        entrada.close();
        for(int i = 0, j = x.length - 1; i < x.length; i++, j--){
            System.out.printf("N[%d] = %d\n", i, x[j]);
        }
    }
}
