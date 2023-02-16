import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner entrada = new Scanner(System.in);
        int qtd = entrada.nextInt();
        int[] x = new int[qtd];
        for(int i = 0; i < x.length; i++){
            x[i] = entrada.nextInt();
        }
        entrada.close();
        for(int i : x){
            if(i % 2 == 0 && i > 0){
                System.out.println("EVEN POSITIVE");
            }else if(i % 2 == 0 && i < 0){
                System.out.println("EVEN NEGATIVE");
            }else if(i % 2 != 0 && i > 0){
                System.out.println("ODD POSITIVE");
            }else if(i % 2 != 0 && i < 0){
                System.out.println("ODD NEGATIVE");
            }else{
                System.out.println("NULL");
            }
        }
    }
}
