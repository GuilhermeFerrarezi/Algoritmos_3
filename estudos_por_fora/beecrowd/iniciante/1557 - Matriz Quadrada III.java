import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner entrada = new Scanner(System.in);
        int n = entrada.nextInt();
        int x, t, y;
        while (n != 0) {
        	int[][] m = new int[n][n];
        	x = 1;
        	for (int i = 1; i <= n; i++) {
        		y = x;
        		for (int j = 1; j <= n; j++) {
        			m[i-1][j-1] = y;
        			y *= 2;
        		}
        		x *= 2;
        	}
        	
        	t = String.valueOf(m[n-1][n-1]).length();
        	
        	for (int i = 1; i <= n; i++) {
        		for (int j = 1; j <= n; j++) {
                    System.out.printf("%"+ t +"d", m[i-1][j-1]);
                    if (j < n) {
                    	System.out.print(" ");
                    }else{
                    	System.out.print("\n");
                    }
        		}
        	}
        	
    		System.out.print("\n");
        	n = entrada.nextInt();
        }
        entrada.close();
    }
}
