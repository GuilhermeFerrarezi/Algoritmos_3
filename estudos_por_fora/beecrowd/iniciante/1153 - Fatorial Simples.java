import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner entrada = new Scanner(System.in);
        int n = entrada.nextInt();
        entrada.close();
        int fat = 1;
        for(int i = n; i > 0; i--){
            fat *= i;
        }
        System.out.println(fat);
    }
}
