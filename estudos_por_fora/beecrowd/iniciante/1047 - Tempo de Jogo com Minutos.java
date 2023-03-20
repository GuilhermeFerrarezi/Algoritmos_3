import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        
    Scanner entrada = new Scanner(System.in);
    int hi = entrada.nextInt();
    int mi = entrada.nextInt();
    int hf = entrada.nextInt();
    int mf = entrada.nextInt();
    entrada.close();
    int dh = hf - hi;
    if (dh < 0) {
    	dh += 24;
    }
    int dm = mf - mi;
    if(dm < 0) {
    	dm += 60;
    	dh--;
    }
    if (hf == hi && mf == mi) {
    	System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
    }else {
    	if (dh < 0) {
    		dh += 24;
    	}
    	System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", dh, dm);
    }
  }
}
