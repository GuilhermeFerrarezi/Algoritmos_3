import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner entrada = new Scanner(System.in);
        int qtd = entrada.nextInt();
        int total = 0, t_coelhos = 0, t_sapos = 0, t_ratos = 0;
        double p_coelhos = 0, p_ratos = 0, p_sapos = 0;
        int qtd_entrada;
        char c_entrada;
        for(int i = 0; i < qtd; i++){
            qtd_entrada = entrada.nextInt();
            total += qtd_entrada;
            c_entrada = entrada.next().charAt(0);
            switch(c_entrada){
                case 'C':
                    t_coelhos += qtd_entrada;
                    break;
                case 'R':
                    t_ratos += qtd_entrada;
                    break;
                case 'S':
                    t_sapos += qtd_entrada;
                    break;
            }
        }
        entrada.close();
        p_coelhos = (100.00 * t_coelhos) / total;
        p_ratos = (100.00 * t_ratos) / total;
        p_sapos = (100.00 * t_sapos) / total;
        System.out.printf("Total: %d cobaias\n", total);
        System.out.printf("Total de coelhos: %d\n", t_coelhos);
        System.out.printf("Total de ratos: %d\n", t_ratos);
        System.out.printf("Total de sapos: %d\n", t_sapos);
        System.out.printf("Percentual de coelhos: %.2f %%\n", p_coelhos);
        System.out.printf("Percentual de ratos: %.2f %%\n", p_ratos);
        System.out.printf("Percentual de sapos: %.2f %%\n", p_sapos);
    }
}
