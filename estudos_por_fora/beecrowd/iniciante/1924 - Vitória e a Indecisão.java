import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner entrada = new Scanner(System.in);
        int qtd = entrada.nextInt();
        int i = 0;
        String[] curso = new String[qtd];
        curso[0] = entrada.nextLine();
        while(qtd > 0){
            curso[i] = entrada.nextLine();
            i++;
            qtd--;
        }
        entrada.close();
        System.out.println("Ciencia da Computacao");
    }
}
