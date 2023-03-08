import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner entrada = new Scanner(System.in);
        int qtd = entrada.nextInt();
        entrada.close();
        
        for(int i = 1; i <= qtd; i++){
            System.out.printf("%d %d %d\n", i, (int) Math.pow(i, 2), (int) Math.pow(i, 3));
            System.out.printf("%d %d %d\n", i, (int) Math.pow(i, 2) + 1, (int) Math.pow(i, 3) + 1);
        }
    }
}
