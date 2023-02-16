import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner entrada = new Scanner(System.in);
        int cod = entrada.nextInt();
        int qtd = entrada.nextInt();
        entrada.close();
        double preco = 0;
        
        if(cod == 1){
            preco = 4.0;
        }else if (cod == 2){
            preco = 4.5;
        }else if (cod == 3){
            preco = 5.0;
        }else if (cod == 4){
            preco = 2.0;
        }else if (cod == 5){
            preco = 1.5;
        }
        
        preco *= qtd;
        
        System.out.printf("Total: R$ %.2f\n", preco);
    }
}
