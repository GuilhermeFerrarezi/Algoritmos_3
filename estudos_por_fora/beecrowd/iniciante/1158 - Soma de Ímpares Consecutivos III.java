import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner entrada = new Scanner(System.in);
         int n = entrada.nextInt();
         int x = 0, y = 0, count = 0, sum = 0;
         for(int i = 0; i < n; i++){
        	 sum = 0;
        	 count = 0;
             x = entrada.nextInt();
             y = entrada.nextInt();
             for(int j = x; count < y; j++){
                 if(j % 2 != 0){
                     sum += j;
                     count++;
                 }
             }
             System.out.println(sum);
         }
         entrada.close();
    }
}
