import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner entrada = new Scanner(System.in);
        int n, centro, interior, exterior;
        while (entrada.hasNext()) {
        	n = entrada.nextInt();
        	centro = n / 2;
        	interior = n / 3;
        	exterior = (n - 1) - interior;
        	for (int i = 0; i < n; i++) {
        		for (int j = 0; j < n; j++) {
        			if (i == centro && j == centro) {
        				System.out.print(4);
        			}else if (i >= interior && j >= interior && i <= exterior && j <= exterior) {
        				System.out.print(1);
        			}else if (i == j) {
        				System.out.print(2);
        			}else if (j == n-i-1) {
        				System.out.print(3);
        			}else{
        				System.out.print(0);
        			}
        		}
        		System.out.print("\n");
        	}
    		System.out.print("\n");
        }
        entrada.close();
    }
}
