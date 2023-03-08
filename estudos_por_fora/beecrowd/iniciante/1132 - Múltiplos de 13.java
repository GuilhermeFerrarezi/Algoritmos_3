import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner entrada = new Scanner(System.in);
        int sum = 0;
        int[] num = new int[2];
        num[0] = entrada.nextInt();
        num[1] = entrada.nextInt();
        entrada.close();
        Arrays.sort(num);
        for(int i = num[0]; i <= num[1]; i++){
            if(i % 13 != 0){
                sum += i;
            }
        }
		System.out.println(sum);
    }
}
