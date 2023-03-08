import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner entrada = new Scanner(System.in);
        int a = entrada.nextInt();
        int sum = 0;
        int n = 0;
        while(n <= 0){
            n = entrada.nextInt();
        }
        entrada.close();
        for(int i = 0; i < n; i++){
            sum += a + i;
        }
        System.out.println(sum);
    }
}
