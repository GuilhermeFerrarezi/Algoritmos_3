import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner entrada = new Scanner(System.in);
        int qtd = entrada.nextInt();
        int x, in = 0, out = 0;
        for(int i = 0; i < qtd; i++){
            x = entrada.nextInt();
            if(x >= 10 && x <= 20){
                in++;
            }else{
                out++;
            }
        }
        entrada.close();
        System.out.printf("%d in\n", in);
        System.out.printf("%d out\n", out);
    }
}
