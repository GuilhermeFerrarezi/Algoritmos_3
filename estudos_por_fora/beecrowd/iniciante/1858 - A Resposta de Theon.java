import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner entrada = new Scanner(System.in);
		int n = entrada.nextInt();
		int t, menor = 0, posMenor = 0;
		for (int i = 1; i <= n; i++) {
			t = entrada.nextInt();
			if (i == 1) {
				posMenor = 1;
				menor = t;
			} else if (t < menor) {
				posMenor = i;
				menor = t;
			}
		}
		entrada.close();
		System.out.println(posMenor);
    }
}
