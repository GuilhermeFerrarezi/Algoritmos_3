import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner entrada = new Scanner(System.in);
        int t = entrada.nextInt();
        entrada.close();
        int[] n = new int[1000];
        for(int i = 0, j = 0; i < n.length; i++, j++){
            if(j == t){
                j = 0;
            }
            System.out.printf("N[%d] = %d\n", i, j);
        }
    }
}
