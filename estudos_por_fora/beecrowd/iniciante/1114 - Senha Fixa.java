import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner entrada = new Scanner(System.in);
        int senha = 0;
        while(senha != 2002){
            senha = entrada.nextInt();
            if(senha == 2002){
                System.out.println("Acesso Permitido");
                continue;
            }
            System.out.println("Senha Invalida");
        }
        entrada.close();
    }
}
