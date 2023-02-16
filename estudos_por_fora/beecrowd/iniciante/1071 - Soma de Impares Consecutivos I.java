import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner entrada = new Scanner(System.in);
        int[] x = new int[2];
        for(int i = 0; i < x.length; i++){
            x[i] = entrada.nextInt();
        }
        entrada.close();
        Arrays.sort(x);
        int sum = 0;
        for(int i = x[0] + 1; i < x[1]; i++){
            if(i % 2 != 0){
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
