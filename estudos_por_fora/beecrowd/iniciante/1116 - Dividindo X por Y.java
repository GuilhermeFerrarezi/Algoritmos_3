import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner entrada = new Scanner(System.in);
        int qtd = entrada.nextInt();
        int x, y;
        for(int i = 0; i < qtd; i++) {
        	x = entrada.nextInt();
        	y = entrada.nextInt();
        	if(y == 0) {
        		System.out.println("divisao impossivel");
        		continue;
        	}
        	System.out.printf("%.1f\n",(double) x / y);
        }
        entrada.close();
    }
}
