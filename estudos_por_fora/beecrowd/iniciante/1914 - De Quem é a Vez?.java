import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner entrada = new Scanner(System.in);
    	int qtd = entrada.nextInt();
    	String[] caso = new String[4];
    	while(qtd > 0) {
    		caso[0] = entrada.nextLine();
    		caso[0] = entrada.nextLine();
    		caso = caso[0].split(" ", 4);
    		int n1 = entrada.nextInt();
    		int n2 = entrada.nextInt();
    		int par = (n1 + n2) % 2;
    		if(par == 0) {
    			if(caso[1].equals("PAR")) {
    				System.out.println(caso[0]);
    			}else {
    				System.out.println(caso[2]);
    			}
    		}else {
    			if(caso[1].equals("IMPAR")) {
    				System.out.println(caso[0]);
    			}else {
    				System.out.println(caso[2]);
    			}
    		}
    		qtd--;
    	}
    	entrada.close();
    }
}
