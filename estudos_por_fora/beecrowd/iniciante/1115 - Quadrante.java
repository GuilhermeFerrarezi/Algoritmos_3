import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner entrada = new Scanner(System.in);
        int x = 1, y = 1;
        while(x != 0 && y != 0){
            x = entrada.nextInt();
            y = entrada.nextInt();
            if(x == 0 || y == 0){
                continue;
            }
            if(x > 0 && y > 0) {
            	System.out.println("primeiro");
            }else if(x < 0 && y > 0) {
            	System.out.println("segundo");
            }else if(x < 0 && y < 0) {
            	System.out.println("terceiro");
            }else if(x > 0 && y < 0) {
            	System.out.println("quarto");
            }
        }
        entrada.close();
    }
 
}
