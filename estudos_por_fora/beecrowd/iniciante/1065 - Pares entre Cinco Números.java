import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner entrada = new Scanner(System.in);
        int[] x = new int[5];
        int count = 0;
        
        for(int i = 0; i < x.length; i++){
            x[i] = entrada.nextInt();
            if(x[i] % 2 == 0){
                count++;
            }
        }
        entrada.close();
        
        System.out.printf("%d valores pares\n", count);
    }
}
