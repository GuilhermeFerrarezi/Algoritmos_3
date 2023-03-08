import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner entrada = new Scanner(System.in);
        double nota1 = 0, nota2 = 0;
        int repete = 1;
        boolean valido = false;
        
        while(repete == 1){
            while (valido != true){
                nota1 = entrada.nextDouble();
                if(nota1 >= 0 && nota1 <= 10){
                    valido = true;
                }else{
                    System.out.println("nota invalida");
                }
            }
            valido = false;
            while (valido != true){
                nota2 = entrada.nextDouble();
                if(nota2 >= 0 && nota2 <= 10){
                    valido = true;
                }else{
                    System.out.println("nota invalida");
                }
            }
            valido = false;
            System.out.printf("media = %.2f\n",(nota1 + nota2)/2);
            repete = 0;
            while(repete != 1 && repete != 2){
                System.out.println("novo calculo (1-sim 2-nao)");
                repete = entrada.nextInt();
            }
        }
        entrada.close();
    }
}
