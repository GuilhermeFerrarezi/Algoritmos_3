import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner entrada = new Scanner(System.in);
        int qtd = entrada.nextInt();
        entrada.close();
        int n1 = 1, n2 = 0, n3 = 0;
        
        for(int i = 0; i < qtd; i++, n1 = n3 + 2){
            n2 = n1 + 1;
            n3 = n2 + 1;
            System.out.printf("%d %d %d PUM\n", n1, n2, n3);
        }
    }
}
