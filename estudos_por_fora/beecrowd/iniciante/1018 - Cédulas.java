import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner entrada = new Scanner(System.in);
        int preco = entrada.nextInt();
        entrada.close();
        int preco_inicial = preco, n100 = 0, n50 = 0, n20 = 0, n10 = 0, n5 = 0, n2 = 0, n1 = 0;
        
        for(int i = preco;i >= 100; i-=100, preco -=100){
            n100++;
        }
        for(int i = preco;i >= 50; i-=50, preco -=50){
            n50++;
        }
        for(int i = preco;i >= 20; i-=20, preco -= 20){
            n20++;
        }
        for(int i = preco;i >= 10; i-=10, preco -= 10){
            n10++;
        }
        for(int i = preco;i >= 5; i-=5, preco -= 5){
            n5++;
        }
        for(int i = preco;i >= 2; i-=2, preco -= 2){
            n2++;
        }
        for(int i = preco;i >= 1; i-=1, preco -= 1){
            n1++;
        }
        
        System.out.println(preco_inicial);
        System.out.println(n100 + " nota(s) de R$ 100,00");
        System.out.println(n50 + " nota(s) de R$ 50,00");
        System.out.println(n20 + " nota(s) de R$ 20,00");
        System.out.println(n10 + " nota(s) de R$ 10,00");
        System.out.println(n5 + " nota(s) de R$ 5,00");
        System.out.println(n2 + " nota(s) de R$ 2,00");
        System.out.println(n1 + " nota(s) de R$ 1,00");
    }
}
