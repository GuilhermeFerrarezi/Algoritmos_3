import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner entrada = new Scanner(System.in);
    	int qtd = entrada.nextInt();
    	while(qtd > 0) {
    		int n = entrada.nextInt();
    		int s = 0, soma = 1;
    		for(int i = 0; i < n; i++) {
    			s += soma;
    			soma = -soma;
    		}
    		System.out.println(s);
    		qtd--;
    	}
    	entrada.close();
    }
} 
