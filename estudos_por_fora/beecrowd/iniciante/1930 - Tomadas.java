import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner entrada = new Scanner(System.in);
        int t1 = entrada.nextInt() - 1;
        int t2 = entrada.nextInt() - 1;
        int t3 = entrada.nextInt() - 1;
        int t4 = entrada.nextInt();
        entrada.close();
        System.out.printf("%d\n", t1 + t2 + t3 + t4);
    }
}
