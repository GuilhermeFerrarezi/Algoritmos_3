import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner entrada = new Scanner(System.in);
    	int n;
        while (entrada.hasNext()) {
    		n = entrada.nextInt();
    		for (int i = 0; i < n; i++) {
    			for (int j = 0; j < n; j++) {
    				if (j == n-i-1) {
    					System.out.print(2);
    				}else if (i == j) {
    					System.out.print(1);
    				}else{
    					System.out.print(3);
    				}
    			}
    			System.out.print("\n");
    		}
    	}
        entrada.close();
    }
}
