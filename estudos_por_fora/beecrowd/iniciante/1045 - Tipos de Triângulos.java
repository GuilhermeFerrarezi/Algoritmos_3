import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner entrada = new Scanner(System.in);
        double[] x = new double[3];
        
        for(int i = 0; i < x.length; i++){
            x[i] = entrada.nextDouble();
            x[i] = -x[i];
        }
        entrada.close();
        Arrays.sort(x);
        for(int i = 0; i < x.length; i++){
            x[i] = -x[i];
        }
        
        if(x[0] >= x[1] + x[2]){
            System.out.println("NAO FORMA TRIANGULO");
        }else{
            if(Math.pow(x[0],2) == Math.pow(x[1],2) + Math.pow(x[2],2)){
                System.out.println("TRIANGULO RETANGULO");
            }
            if(Math.pow(x[0],2) > Math.pow(x[1],2) + Math.pow(x[2],2)){
                System.out.println("TRIANGULO OBTUSANGULO");
            }
            if(Math.pow(x[0],2) < Math.pow(x[1],2) + Math.pow(x[2],2)){
                System.out.println("TRIANGULO ACUTANGULO");
            }
            if(x[0] == x[1] && x[1] == x[2]){
                System.out.println("TRIANGULO EQUILATERO");
            }else{
                if(x[0] == x[1] || x[0] == x[2] || x[1] == x[2]){
                    System.out.println("TRIANGULO ISOSCELES");
                }
            }
        }
    }
}
