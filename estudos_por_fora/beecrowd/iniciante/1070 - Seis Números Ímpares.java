import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner entrada = new Scanner(System.in);
        int x = entrada.nextInt();
        entrada.close();
        if(x % 2 == 0){
            for(int i = x; i < x+12; i++){
                if(i % 2 != 0){
                    System.out.println(i);
                }
            }
        }else{
            for(int i = x; i < x + 11; i++){
              if(i % 2 != 0){
                System.out.println(i);
              }
           }
        }
    }
}
