import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner entrada = new Scanner(System.in);
        int n = entrada.nextInt();
        int[] x = new int[n];
        int menor = 0, posicao = 0;
        for(int i = 0; i < x.length; i++){
            x[i] = entrada.nextInt();
        }
        entrada.close();
        menor = x[0];
        for(int i = 0; i < x.length; i++){
            if (x[i] < menor){
                menor = x[i];
                posicao = i;
            }
        }
        System.out.printf("Menor valor: %d\n", menor);
        System.out.printf("Posicao: %d\n", posicao);
    }
}
