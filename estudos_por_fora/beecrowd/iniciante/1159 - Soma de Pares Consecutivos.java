import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner entrada = new Scanner(System.in);
        int x = entrada.nextInt();
        int sum = 0, count = 0;
        while(x != 0){
            sum = 0;
            count = 0;
            for(int i = x; count < 5; i++){
                if(i % 2 == 0){
                    sum += i;
                    count++;
                }
            }
            System.out.println(sum);
            x = entrada.nextInt();
        }
        entrada.close();
    }
}
