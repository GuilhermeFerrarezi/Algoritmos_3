import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner entrada = new Scanner(System.in);
        int segundos = entrada.nextInt();
        entrada.close();
        int horas = segundos / 3600;
        segundos %= 3600;
        int minutos = segundos / 60;
        segundos %= 60;
        
        System.out.printf("%d:%d:%d\n", horas, minutos, segundos);
    }
}
