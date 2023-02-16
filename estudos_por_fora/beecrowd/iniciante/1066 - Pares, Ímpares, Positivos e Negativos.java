import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        int[] x = new int[5];
		int count_par = 0, count_impar = 0, count_pos = 0, count_neg = 0;

		Scanner entrada = new Scanner(System.in);
		for(int i = 0; i < x.length; i++) {
			x[i] = entrada.nextInt();
			if(x[i] < 0) {
				count_neg++;
			}else if(x[i] > 0) {
				count_pos++;
			}
			if(x[i] % 2 == 0) {
				count_par++;
			}else {
				count_impar++;
			}
		}
		entrada.close();
		
		System.out.printf("%d valor(es) par(es)\n", count_par);
		System.out.printf("%d valor(es) impar(es)\n", count_impar);
		System.out.printf("%d valor(es) positivo(s)\n", count_pos);
		System.out.printf("%d valor(es) negativo(s)\n", count_neg);
    }
}
