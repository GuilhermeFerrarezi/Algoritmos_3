import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
    	Scanner entrada = new Scanner(System.in);
        int qtd_alcool = 0, qtd_gasolina = 0, qtd_diesel = 0, produto = 0;
        while(produto != 4){
        	produto = 0;
            while(produto != 1 && produto != 2 && produto != 3 && produto != 4){
                produto = entrada.nextInt();
            }
            switch(produto){
                case 1:
                    qtd_alcool++;
                    break;
                case 2:
                    qtd_gasolina++;
                    break;
                case 3:
                    qtd_diesel++;
                    break;
            }
        }
        entrada.close();
        System.out.println("MUITO OBRIGADO");
		System.out.printf("Alcool: %d\n", qtd_alcool);
		System.out.printf("Gasolina: %d\n", qtd_gasolina);
		System.out.printf("Diesel: %d\n", qtd_diesel);
    }
}
