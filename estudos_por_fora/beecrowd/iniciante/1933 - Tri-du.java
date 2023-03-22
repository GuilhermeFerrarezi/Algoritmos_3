import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner entrada = new Scanner(System.in);
        int[] a = new int[2];
        for(int i = 0; i < a.length; i++){
            a[i] = entrada.nextInt();
        }
        entrada.close();
        Arrays.sort(a);
        System.out.println(a[1]);
    }
}
