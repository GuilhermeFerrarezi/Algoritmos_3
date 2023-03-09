import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
    	Scanner entrada = new Scanner(System.in);
    	ArrayList<Integer> arr = new ArrayList<Integer>();
        int n = entrada.nextInt();
        double media = 0;
        while(n >= 0) {
        	arr.add(n);
        	n = entrada.nextInt();
        }
        entrada.close();
        for(int i : arr) {
        	media += i;
        }
        media /= arr.size();
        System.out.printf("%.2f\n", media);
    }
}
