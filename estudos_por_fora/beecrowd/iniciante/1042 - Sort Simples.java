import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner entrada = new Scanner(System.in);
        int[] a = new int[3];
        int[] b = new int[3];
        for(int i = 0; i < a.length; i++){
            a[i] = entrada.nextInt();
        }
        entrada.close();
        for(int i = 0; i < a.length; i++){
            b[i] = a[i];
        }
        Arrays.sort(b);
        for(int i = 0; i < b.length; i++){
            System.out.println(b[i]);
        }
        System.out.printf("\n");
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
    }
}
