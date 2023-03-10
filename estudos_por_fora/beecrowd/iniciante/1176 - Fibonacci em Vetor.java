import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {

    	Scanner entrada = new Scanner(System.in);
        int qtd = entrada.nextInt();
        int n = 0;
        long anterior = 0, atual = 1, proximo;
        while(qtd > 0){
        	n = entrada.nextInt();
        	anterior = 0;
        	atual = 1;
        	proximo = 0;
	        for (int i = 0; i < n; i++) {
	        	proximo = anterior + atual;
	        	anterior = atual;
	        	atual = proximo;
	        }
	        System.out.printf("Fib(%d) = %d\n", n, anterior);
	        qtd--;
        }
        entrada.close();
    }
}
