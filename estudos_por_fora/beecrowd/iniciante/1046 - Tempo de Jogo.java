import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner entrada = new Scanner(System.in);
        int a = entrada.nextInt();
        int b = entrada.nextInt();
        entrada.close();
        int c, d;
        if(a>=b){
            c=24-a;
            d=c+b;
        }else{
            d=b-a;
        }
        System.out.printf("O JOGO DUROU %d HORA(S)\n", d);
    }
}
