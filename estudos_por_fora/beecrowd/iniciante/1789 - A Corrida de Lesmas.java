import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner entrada = new Scanner(System.in);
        int l, v, maior = 0, nivel = 0;
        
        while(entrada.hasNext()){
            maior = 0;
            l = entrada.nextInt();
            while(l > 0){
                v = entrada.nextInt();
                if(v < 10){
                    nivel = 1;
                }else if(v >= 10 && v < 20){
                    nivel = 2;
                }else if(v >= 20){
                    nivel = 3;
                }
                if(nivel > maior){
                    maior = nivel;
                }
                l--;
            }
            System.out.println(maior);
        }
    }
}
