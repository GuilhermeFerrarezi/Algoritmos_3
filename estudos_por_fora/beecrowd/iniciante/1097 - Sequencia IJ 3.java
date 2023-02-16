import java.io.IOException;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        int i = 1, j = 7;
        do{
            System.out.printf("I=%d J=%d\n", i, j);
            j--;
            System.out.printf("I=%d J=%d\n", i, j);
            j--;
            System.out.printf("I=%d J=%d\n", i, j);
            j+=4;
            i+=2;
        }while(i<10);
    }
}
