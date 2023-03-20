import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
      
        Scanner entrada = new Scanner(System.in);
        int A = entrada.nextInt();
        int B = entrada.nextInt();
        int C = entrada.nextInt();
        entrada.close();
        if (B < A && C >= B) {
        	System.out.println(":)");
        }else if (B > A && C <= B) {
        	System.out.println(":(");
        }else if (B > A && C > B && (C - B) < (B - A)) {
        	System.out.println(":(");
        }else if (B > A && C > B && (C - B) >= (B - A)) {
        	System.out.println(":)");
        }else if (B < A && C < B && (B - C) < (A - B)) {
        	System.out.println(":)");
        }else if (B < A && C < B && (B - C) >= (A - B)) {
        	System.out.println(":(");
        }else if (B == A && C > B) {
        	System.out.println(":)");
        }else if (B == A && C < B) {
        	System.out.println(":(");
        }else{
        	System.out.println(":(");
        }
    }
}
