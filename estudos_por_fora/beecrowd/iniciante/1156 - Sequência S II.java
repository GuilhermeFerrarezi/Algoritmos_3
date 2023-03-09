import java.io.IOException;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        double s = 0;
        for(double dividendo = 1.00, divisor = 1.00; dividendo <= 39; dividendo += 2.00, divisor *= 2.00){
            s += dividendo / divisor;
        }
        System.out.printf("%.2f\n", s);
    }
}
