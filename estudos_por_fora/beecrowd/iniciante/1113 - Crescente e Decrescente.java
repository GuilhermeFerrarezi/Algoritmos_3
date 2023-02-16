import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner entrada = new Scanner(System.in);
        int x = 0, y = 1;
        while(x != y){
            x = entrada.nextInt();
            y = entrada.nextInt();
            
            if(x == y) {
            	continue;
            }
            if(x > y) {
            	System.out.println("Decrescente");
            }else {
            	System.out.println("Crescente");
            }
        }
        entrada.close();
	    }
    }
 
