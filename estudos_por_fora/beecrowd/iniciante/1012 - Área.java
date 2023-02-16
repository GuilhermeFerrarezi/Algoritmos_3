import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner entrada = new Scanner(System.in);
        final double pi = 3.14159;
        double a = entrada.nextDouble();
        double b = entrada.nextDouble();
        double c = entrada.nextDouble();
        entrada.close();
        double areatri = (a * c) / 2;
        double areacir = pi * Math.pow(c, 2);
        double areatra = ((a + b) * c) / 2;
        double areaqua = Math.pow(b,2);
        double arearet = a * b;
        
        System.out.printf("TRIANGULO: %.3f\nCIRCULO: %.3f\nTRAPEZIO: %.3f\nQUADRADO: %.3f\nRETANGULO: %.3f\n", areatri, areacir, areatra, areaqua, arearet);
    }
}
