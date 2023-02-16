import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner entrada = new Scanner(System.in);
        int n = entrada.nextInt();
        int maior = n, indice = 1;
        for(int i = 0; i < 99; i++){
            n = entrada.nextInt();
            if(n > maior){
                maior = n;
                indice = i + 2;
            }
        }
        entrada.close();
    }
}
