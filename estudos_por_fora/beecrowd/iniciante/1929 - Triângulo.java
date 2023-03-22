import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
 
    public static void main(String[] args) throws IOException {
      
      Scanner entrada = new Scanner(System.in);
    	int[] a = new int[4];
		  for(int i = 0; i < a.length; i++) {
			a[i] = entrada.nextInt();
		  }
		  entrada.close();
		  Arrays.sort(a);
		  if ((a[1] + a[0] > a[3] ) || (a[1] + a[0] > a[2]) ||
		    	(a[1] + a[2] > a[3]) || (a[0] + a[2] > a[3])) {
		    System.out.println('S');
		  }else {
				System.out.println('N');
		  }
    }
}
