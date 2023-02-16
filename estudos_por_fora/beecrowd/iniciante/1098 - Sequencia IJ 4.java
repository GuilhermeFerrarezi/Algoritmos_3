import java.io.IOException;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        double i = 0.00, j = 1.00;
        do{
            if(i == (int) i || i >1.97){
                System.out.printf("I=%.0f J=%.0f\n", i, j);
                j++;
                System.out.printf("I=%.0f J=%.0f\n", i, j);
                j++;
                System.out.printf("I=%.0f J=%.0f\n", i, j);
                j-=1.8;
                i+=0.2;
            }else{
                System.out.printf("I=%.1f J=%.1f\n", i, j);
                j++;
                System.out.printf("I=%.1f J=%.1f\n", i, j);
                j++;
                System.out.printf("I=%.1f J=%.1f\n", i, j);
                j-=1.8;
                i+=0.2;
            }
        }while(i<=2);
    }
}
