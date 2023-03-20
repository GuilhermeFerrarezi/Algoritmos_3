import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner entrada = new Scanner(System.in);
        int qtd = entrada.nextInt();
        String[] heroi = new String[2];
        heroi[0] = entrada.nextLine();
        while(qtd > 0){
            boolean levanta = false;
            heroi[0] = entrada.nextLine();
            heroi = heroi[0].split(" ", 2);
            if(heroi[0].equals("Thor")){
                levanta = true;
            }
            if(levanta){
                System.out.println('Y');
            }else{
                System.out.println('N');
            }
            qtd--;
        }
        entrada.close();
    }
}
