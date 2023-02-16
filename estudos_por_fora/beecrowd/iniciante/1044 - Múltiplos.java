import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner entrada = new Scanner(System.in);
        int[] n1 = new int[2];
        for(int i = 0; i < n1.length; i++){
            n1[i] = entrada.nextInt();
        }
        entrada.close();
        Arrays.sort(n1);
        if (n1[1] % n1[0] == 0) {
          System.out.println("Sao Multiplos");
        }else {
          System.out.println("Nao sao Multiplos");
        }
      }
    }
