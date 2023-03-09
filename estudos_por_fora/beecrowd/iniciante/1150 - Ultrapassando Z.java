import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner entrada = new Scanner(System.in);
        int x = entrada.nextInt();
        int z = entrada.nextInt();
        int count = 2, sum = x;
        while(z <= x){
            z = entrada.nextInt();
        }
        entrada.close();
        for(int i = x; sum <= z; i++){
        	if(i == x) {
        		sum += i;
        	}else {
        		sum += i;
            	count++;
        	}
        }
        System.out.println(count);
    }
}
