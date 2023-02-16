import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner entrada = new Scanner(System.in);
    	double sal = entrada.nextDouble();
    	entrada.close();
    	double percent = 0;
    	double reajuste;
    	if (sal <= 400.00) {
    		percent = 15;
    	}else if (sal >= 400.01 && sal <= 800.00) {
    		percent = 12;
    	}else if (sal >= 800.01 && sal <= 1200.00) {
    		percent = 10;
    	}else if (sal >= 1200.01 && sal <= 2000.00) {
    		percent = 7;
    	}else if (sal > 2000.0) {
    		percent = 4;
    	}
    reajuste = sal * (percent / 100);
    sal += reajuste;
    System.out.printf("Novo salario: %.2f\n", sal);
    System.out.printf("Reajuste ganho: %.2f\n", reajuste);
    System.out.printf("Em percentual: %.0f %%\n", percent);
    }
}
