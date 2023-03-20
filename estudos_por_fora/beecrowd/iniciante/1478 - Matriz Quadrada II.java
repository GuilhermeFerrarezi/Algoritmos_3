import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner entrada = new Scanner(System.in);
    	int n = entrada.nextInt();
    	int x;
    	while (n != 0) {
    		String linha = "";
    		for (int i = 1; i <= n; i++) {
    			x = i;
    			for (int j = 1; j <= n; j++) {
    				if (i == j) {
    					x = 1;
    				}
                    if (j < n) {
                    	if(x < 10) {
                    		linha += "  " + x;
                    	}else if(x >= 10 && x < 99) {
                    		linha += " " + x;
                    	}else {
                    		linha += x;
                    	}
                     linha +=" ";
                    }else{
                    	if(x < 10) {
                    		linha += "  " + x;
                    	}else if(x >= 10 && x < 99) {
                    		linha += " " + x;
                    	}else {
                    		linha += x;
                    	}
                    	System.out.println(linha);
                    	linha = "";
                    }
                    
    				if (j >= i) {
    					x++;
    				}else {
    					x--;
    				}
    			}
    		}
    		System.out.println();
    		n = entrada.nextInt();
    	}
    	entrada.close();
    }
}
