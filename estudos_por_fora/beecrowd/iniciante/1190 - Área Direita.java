import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner entrada = new Scanner(System.in);
        Double[][] m = new Double[12][12];
        double sum = 0;
        int limite = m.length - 1, min = 0, qtd = 0;
        char o = entrada.nextLine().toUpperCase().charAt(0);
        
        for(int i = 0; i < m.length; i++, limite--, min++){
            for(int j = 0; j < m[i].length; j++){
                m[i][j] = entrada.nextDouble();
                if(j > limite && j > min){
                    sum += m[i][j];
                    qtd++;
                }
            }
        }
        entrada.close();
        if(o == 'S'){
            System.out.printf("%.1f\n", sum);
        }else if(o == 'M'){
            System.out.printf("%.1f\n", sum / qtd);
        }
    }
}
