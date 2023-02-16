import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

      Scanner entrada = new Scanner(System.in);
    	String auxiliar = entrada.next();
      int diaInicial = entrada.nextInt() * 24;
      int horaInicial = (entrada.nextInt() + diaInicial) * 60;
      auxiliar = entrada.next();
      int minutoInicial = (entrada.nextInt() + horaInicial) * 60;
      auxiliar = entrada.next();
      int segundoInicial = (entrada.nextInt() + minutoInicial);

      auxiliar = entrada.next();
      int diaFinal = entrada.nextInt() * 24;
      int horaFinal = (entrada.nextInt() + diaFinal) * 60;
      auxiliar = entrada.next();
      int minutoFinal = (entrada.nextInt() + horaFinal) * 60;
      auxiliar = entrada.next();
      int segundoFinal = entrada.nextInt() + minutoFinal;
      entrada.close();

      if (horaFinal < horaInicial) segundoFinal += 86400;

      int segundoTotal = segundoFinal - segundoInicial;

      int dias = 0;
      int horas = 0;
      int minutos = 0;
      int segundos = 0;

      for(int i = 0; i < segundoTotal; i++){

        segundos += 1;
        if(segundos == 60) {
          segundos -= 60;
          minutos += 1;
        }
        if(minutos == 60) {
          minutos -= 60;
          horas += 1;
        }
        if(horas == 24) {
          horas -= 24;
          dias += 1;
        }
      }

      System.out.println(dias + " dia(s)");
      System.out.println(horas + " hora(s)");
      System.out.println(minutos + " minuto(s)");
      System.out.println(segundos + " segundo(s)");
      }
}
