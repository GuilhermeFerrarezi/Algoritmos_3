import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner entrada = new Scanner(System.in);
        int qtd = entrada.nextInt();
        int x = 0;
        boolean primo = true;
        while(qtd > 0){
            primo = true;
            x = entrada.nextInt();
            if (x == 1){
                primo = false;
            }else{
                for (int i = 2; i <= Math.sqrt(x); i++) {
                    if (x % i == 0) {
                        primo = false;
                    }
                }
            }
            if(primo == true){
                System.out.printf("%d eh primo\n", x);
            }else{
                System.out.printf("%d nao eh primo\n", x);
            }
            qtd--;
        }
        entrada.close();
    }
}
