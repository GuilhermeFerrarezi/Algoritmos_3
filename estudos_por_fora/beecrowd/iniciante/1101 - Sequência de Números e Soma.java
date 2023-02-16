import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner entrada = new Scanner(System.in);
        int[] n = new int[2];
        n[0] = 1;
        n[1] = 1;
        int soma = 0;
        while(n[0] > 0 && n[1] > 0){
            n[0] = entrada.nextInt();
            n[1] = entrada.nextInt();
            if(n[0] <= 0 || n[1] <= 0) {
            	continue;
            }
            Arrays.sort(n);
            for(int i = n[0]; i <= n[1]; i++){
                System.out.printf("%d ",i);
                soma+=i;
            }
            System.out.printf("Sum=%d\n", soma);
            soma = 0;
        }
        entrada.close();
    }
}
