import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner entrada = new Scanner(System.in);
        int n = entrada.nextInt();
        entrada.close();
        for(int i = 1; i < 11; i++){
            System.out.printf("%d x %d = %d\n", i, n, i*n);
        }
    }
}
