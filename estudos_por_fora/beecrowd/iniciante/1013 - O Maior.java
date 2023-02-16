import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner entrada = new Scanner(System.in);
        int a = entrada.nextInt();
        int b = entrada.nextInt();
        int c = entrada.nextInt();
        entrada.close();
        int maiorAB = (a + b + Math.abs(a - b))/2;
        int maior = (maiorAB + c + Math.abs(maiorAB - c))/2;
        
        System.out.printf("%d eh o maior\n", maior);
    }
}
