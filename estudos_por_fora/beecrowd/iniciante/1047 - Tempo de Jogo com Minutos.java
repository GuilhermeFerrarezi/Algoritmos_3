import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        
    Scanner entrada = new Scanner(System.in);
    int st = entrada.nextInt();
    int sm = entrada.nextInt();
    int et = entrada.nextInt();
    int em = entrada.nextInt();
    entrada.close();
    int rt = et - st;
    if (rt < 0) {
    	rt = 24 + (et - st);
    }
    int rm = em - sm;
    if(rm < 0) {
    	rm = 60 + (em - sm);
    	rt--;
    }
    if (et == st && em == sm) {
    	System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
    }else {
    	if (rt < 0) {
    		rt += 24;
    	}
    	System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", rt, rm);
    }
  }
}
