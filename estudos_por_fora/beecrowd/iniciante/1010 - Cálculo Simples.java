import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner entrada = new Scanner(System.in);
        int cod1 = entrada.nextInt();
        int num1 = entrada.nextInt();
        double custo1 = entrada.nextDouble();
        int cod2 = entrada.nextInt();
        int num2 = entrada.nextInt();
        double custo2 = entrada.nextDouble();
        double preco1, preco2;
        entrada.close();
        
        preco1 = num1 * custo1;
        preco2 = num2 * custo2;
        
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", preco1 + preco2);
    }
}
