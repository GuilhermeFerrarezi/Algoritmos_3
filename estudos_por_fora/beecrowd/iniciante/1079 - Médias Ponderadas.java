import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner entrada = new Scanner(System.in);
        int qtd = entrada.nextInt();
        for(int i = 0; i < qtd; i++){
            double n1 = entrada.nextDouble();
            double n2 = entrada.nextDouble();
            double n3 = entrada.nextDouble();
            System.out.printf("%.1f\n", ((n1*2) + (n2*3) + (n3*5))/10);
        }
        entrada.close();
    }
}
