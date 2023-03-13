import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner entrada = new Scanner(System.in);
        int[] par = new int[5];
        int[] impar = new int[5];
        int x = 0, countPar = 0, countImpar = 0;
        for (int i = 0; i < 15; i++) {
        	x = entrada.nextInt();
        	
        	if (x % 2 == 0) {
        		par[countPar] = x; 
        		countPar++;
        	} else {
        		impar[countImpar] = x;
        		countImpar++;
        	}
        	
        	if (countPar == 5) {
        		countPar = 0;
        		for (int j = 0; j < par.length; j++) {
        			System.out.printf("par[%d] = %d\n", j, par[j]);
        		}
        	} else if (countImpar == 5) {
        		countImpar = 0;
        		for (int j = 0; j < impar.length; j++) {
        			System.out.printf("impar[%d] = %d\n", j, impar[j]);
        		}
        	}
        }
        entrada.close();
        
        for (int i = 0; i < countImpar; i++) {
			System.out.printf("impar[%d] = %d\n", i, impar[i]);
        }
        for (int i = 0; i < countPar; i++) {
			System.out.printf("par[%d] = %d\n", i, par[i]);
        }
    }
}
