import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner entrada = new Scanner(System.in);
        int tempo = entrada.nextInt();
        int vel = entrada.nextInt();
        entrada.close();
        double litros = (tempo * vel) / 12.0;
        
        System.out.printf("%.3f\n", litros);
    }
}
