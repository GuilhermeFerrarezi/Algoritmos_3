import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner entrada = new Scanner(System.in);
        
        int t = entrada.nextInt();
        String jogada = entrada.nextLine();
        String resultado;
        
        for(int i = 1; i <= t; i++){
            resultado = null;
            jogada = entrada.nextLine();
            String[] jogo = jogada.split(" ");
            if(jogo[0].equals(jogo[1])){
                resultado = "De novo!";
            }else if((jogo[0].equals("tesoura") && jogo[1].equals("papel")) ||
                     (jogo[0].equals("papel") && jogo[1].equals("pedra")) ||
                     (jogo[0].equals("pedra") && jogo[1].equals("lagarto")) ||
                     (jogo[0].equals("lagarto") && jogo[1].equals("Spock")) ||
                     (jogo[0].equals("Spock") && jogo[1].equals("tesoura")) ||
                     (jogo[0].equals("tesoura") && jogo[1].equals("lagarto")) ||
                     (jogo[0].equals("lagarto") && jogo[1].equals("papel")) ||
                     (jogo[0].equals("papel") && jogo[1].equals("Spock")) ||
                     (jogo[0].equals("Spock") && jogo[1].equals("pedra")) ||
                     (jogo[0].equals("pedra") && jogo[1].equals("tesoura"))){
                resultado = "Bazinga!";
            }else{
                resultado = "Raj trapaceou!";
            }
            System.out.printf("Caso #%d: %s\n", i, resultado);
        }
        entrada.close();
    }
}
