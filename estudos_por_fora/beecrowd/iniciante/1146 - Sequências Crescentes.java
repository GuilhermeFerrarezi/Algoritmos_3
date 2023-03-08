import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner entrada = new Scanner(System.in);
        int qtd = 99;
        String teste = "";
        while(qtd != 0){
            qtd = entrada.nextInt();
            if (qtd != 0){
                for(int i = 1; i <= qtd; i++){
                    if(i % qtd == 0){
                    	teste += i;
                    }else {                    	
                    	teste += i + " ";
                    }
                }
                System.out.println(teste);
                teste = "";
            }
        }
        entrada.close();
    }
}
