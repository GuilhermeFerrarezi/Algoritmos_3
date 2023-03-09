import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner entrada = new Scanner(System.in);
        int n = entrada.nextInt();
        int sum = 0, x = 0;
        while(n > 0){
            sum = 0;
            x = entrada.nextInt();
            for(int i = x - 1; i > 0; i--){
            	if(x % i == 0) {
            		sum += i;
            	}
            }
            if(sum == x){
                System.out.printf("%d eh perfeito\n", x);
            }else{
                System.out.printf("%d nao eh perfeito\n", x);
            }
            n--;
        }
        entrada.close();
    }
}
