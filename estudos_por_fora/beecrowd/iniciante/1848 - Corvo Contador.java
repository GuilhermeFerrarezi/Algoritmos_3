import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner entrada = new Scanner(System.in);
        int numero = 0, flag = 0;
        String corvo;
        for (int i = 0; i < 3; i++) {
        	numero = 0;
        	flag = 0;
        	while (flag == 0) {
        		corvo = entrada.nextLine();
        		switch (corvo) {
	        		case "--*":
	        			numero += 1;
	        			break;
	        		case "-*-":
	        			numero += 2;
	        			break;
	        		case "-**":
	        			numero += 3;
	        			break;
	        		case "*--":
	        			numero += 4;
	        			break;
	        		case "*-*":
	        			numero += 5;
	        			break;
	        		case "**-":
	        			numero += 6;
	        			break;
	        		case "***":
	        			numero += 7;
	        			break;
	        		default: 
	        			flag = 1;
	        			break;
        		}
        	}
        	System.out.println(numero);
        }
        entrada.close();
    }
}
