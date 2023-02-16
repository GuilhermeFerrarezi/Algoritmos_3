import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

      Scanner entrada = new Scanner(System.in);
      String tipo = entrada.next();
      String tipo2 = entrada.next();
      String tipo3 = entrada.next();
      entrada.close();

      if (tipo.equals("vertebrado")) {
        if(tipo2.equals("ave")) {
          if(tipo3.equals("carnivoro")) {
            System.out.println("aguia");
          }else if(tipo3.equals("onivoro")) {
            System.out.println("pomba");
          }
        }else if(tipo2.equals("mamifero")) {
          if(tipo3.equals("onivoro")) {
            System.out.println("homem");
          }else if(tipo3.equals("herbivoro")) {
            System.out.println("vaca");
          }
        }
      }else if(tipo.equals("invertebrado")) {
        if(tipo2.equals("inseto")){
          if(tipo3.equals("hematofago")) {
            System.out.println("pulga");
          }else if (tipo3.equals("herbivoro")) {
            System.out.println("lagarta");
          }
        }else if(tipo2.equals("anelideo")) {
          if(tipo3.equals("hematofago")){
            System.out.println("sanguessuga");    						
          }else if (tipo3.equals("onivoro")) {
            System.out.println("minhoca");
				  }
			  }
		  }
    }
  }
