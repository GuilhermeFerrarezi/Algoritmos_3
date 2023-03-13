import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {

    	Scanner entrada = new Scanner(System.in);
        int c = entrada.nextInt();
        char t = entrada.next().toUpperCase().charAt(0);
        double[][] m = new double[12][12];
        double sum = 0;
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[i].length; j++) {
            	m[i][j] = entrada.nextDouble();
            	if(j == c) {
            		sum += m[i][j];
            	}
            }
        }
        entrada.close();
        if(t == 'S') {
        	System.out.printf("%.1f\n", sum);
        }else if(t == 'M') {
        	System.out.printf("%.1f\n", sum / m[c].length);
        }
    }
}
