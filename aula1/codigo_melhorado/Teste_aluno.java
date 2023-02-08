package aula1;

import java.util.Scanner;

public class Teste_aluno {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int i = 0;
		
		Aluno[] x1 = new Aluno[2];
		
		x1[0] = new Aluno("Paulo", 5515, "800912345-12", 'M');
		x1[1] = new Aluno("Ana", 991239, "500876123-15", 'F');
		
		for (Aluno aluno: x1) {
			i++;
			System.out.println("Digite as notas do " + i +"º  aluno:");
	       		aluno.nota_P1 = entrada.nextDouble();
	        	aluno.nota_P2 = entrada.nextDouble();
	        	aluno.nota_P3 = entrada.nextDouble();
		}
		
		entrada.close();
		
		for (Aluno aluno:x1) {
			aluno.Imprime_aluno();
			aluno.Imprime_sexo();
			aluno.Media_aluno();
			aluno.Imprime_media();
			aluno.Resultado();
		}
	}
}
