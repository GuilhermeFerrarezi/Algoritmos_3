import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner entrada = new Scanner(System.in);
        int num = entrada.nextInt();
        int horas = entrada.nextInt();
        double valor = entrada.nextDouble();
        double salario = valor * horas;
        entrada.close();
        
        System.out.println("NUMBER = " + num);
        System.out.printf("SALARY = U$ %.2f\n", salario);
    }
}
