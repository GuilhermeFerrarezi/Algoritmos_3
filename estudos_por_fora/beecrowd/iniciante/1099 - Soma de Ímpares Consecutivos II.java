import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner entrada = new Scanner(System.in);
        int qtd = entrada.nextInt();
        int soma = 0;
        int[] x = new int[2];
        for(int i = 0; i < qtd; i++){
            for(int j = 0; j<x.length;j++){
                x[j] = entrada.nextInt();
                
            }
            Arrays.sort(x);
            for(int j = x[0]+1;j<x[1];j++){
                if(j%2!=0){
                    soma+=j;
                }
            }
            System.out.println(soma);
            soma = 0;
        }
        entrada.close();
    }
}
