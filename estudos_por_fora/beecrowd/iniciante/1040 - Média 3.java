import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        DecimalFormat df = new DecimalFormat("0.0");
        Scanner entrada = new Scanner(System.in);
        double n1 = entrada.nextDouble();
        double n2 = entrada.nextDouble();
        double n3 = entrada.nextDouble();
        double n4 = entrada.nextDouble();
        double exame;
        double media = ((n1 * 2) + (n2 * 3) + (n3 * 4) + n4) / 10;
        
        System.out.println("Media: " + df.format(media));
        if (media >= 7){
            System.out.println("Aluno aprovado.");
        }else if (media < 5){
            System.out.println("Aluno reprovado.");
        }else{
            System.out.println("Aluno em exame.");
            exame = entrada.nextDouble();
            System.out.println("Nota do exame: " + df.format(exame));
            media = (media + exame) / 2;
            if (media >= 5){
                System.out.println("Aluno aprovado.");
            }else{
                System.out.println("Aluno reprovado.");
            }
            System.out.println("Media final: " + df.format(media));
        }
        entrada.close();
    }
}
