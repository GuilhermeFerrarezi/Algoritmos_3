import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner entrada = new Scanner(System.in);
        int n = entrada.nextInt();
        entrada.close();
        int idx = 1;
        char[] frase = {'L', 'I' , 'F', 'E', ' ', 'I', 'S', ' ', 'N', 'O', 'T', ' ', 'A', ' ', 'P', 'R', 'O',
        		'B', 'L', 'E', 'M', ' ', 'T', 'O', ' ', 'B', 'E', ' ', 'S', 'O', 'L', 'V', 'E', 'D'};
        String saida = "";
        for(char c : frase){
            if(idx > n){
                break;
            }
            saida += c;
            idx++;
        }
        System.out.println(saida);
    }
}
