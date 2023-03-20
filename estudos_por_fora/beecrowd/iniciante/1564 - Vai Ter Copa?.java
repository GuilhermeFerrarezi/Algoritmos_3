import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner entrada = new Scanner(System.in);
        int n;
        do{
            n = entrada.nextInt();
            if(n == 0){
                System.out.println("vai ter copa!");
            }else{
                System.out.println("vai ter duas!");
            }
        }while(entrada.hasNext());
        entrada.close();
    }
}
