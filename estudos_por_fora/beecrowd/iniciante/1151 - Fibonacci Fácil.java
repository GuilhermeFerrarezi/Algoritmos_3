import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner entrada = new Scanner(System.in);
        int n = entrada.nextInt();
        entrada.close();
        int anterior = 0, proximo = 0, atual = 1;
        for(int i = 0; i < n; i++){
            if(i == n - 1){
                System.out.println(anterior);
            }else{
                System.out.printf("%d ", anterior);
                proximo = anterior + atual;
                anterior = atual;
                atual = proximo;
            }
        }
    }
}
