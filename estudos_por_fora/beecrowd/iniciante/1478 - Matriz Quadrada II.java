import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner entrada = new Scanner(System.in);
    	int n = entrada.nextInt();
    	int x;
    	while (n != 0) {
    		for (int i = 1; i <= n; i++) {
    			x = i;
    			for (int j = 1; j <= n; j++) {
    				if (i == j) {
    					x = 1;
    				}
    				
                    System.out.printf("%3d", x);
                    if (j < n) {
                    	System.out.print(" ");
                    }
                    else{
                    	System.out.print("\n");
                    }
                    
    				if (j >= i) {
    					x++;
    				}else {
    					x--;
    				}
    			}
    		}
    		System.out.printf("\n");
    		n = entrada.nextInt();
    	}
    	entrada.close();
    }
}
