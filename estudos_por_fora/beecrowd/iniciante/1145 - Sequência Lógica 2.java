import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner entrada = new Scanner(System.in);
		    int x = entrada.nextInt();
		    int y = entrada.nextInt();
		    entrada.close();
		    for (int i = 1; i <= y; i++) {
			    System.out.printf("%d", i);
			    if (i % x == 0) {
				    System.out.println("");
			    }else {
				    System.out.print(" ");
			    }
		   }
    }
}
