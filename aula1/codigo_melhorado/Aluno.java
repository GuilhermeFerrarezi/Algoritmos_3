package aula1;

import java.util.Scanner;

public class Teste_aluno {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		double nota_p1, nota_p2, nota_p3;
			
        	System.out.println("Digite as notas do primeiro aluno: ");
        	nota_p1 = entrada.nextDouble();
        	nota_p2 = entrada.nextDouble();
        	nota_p3 = entrada.nextDouble();
			
		Aluno x1 = new Aluno("Paulo", 5515, "800912345-12", 'M', nota_p1, nota_p2, nota_p3);
			
		System.out.println("Digite as notas do segundo aluno: ");
        	nota_p1 = entrada.nextDouble();
        	nota_p2 = entrada.nextDouble();
        	nota_p3 = entrada.nextDouble();
        	
        	Aluno x2 = new Aluno("Ana", 991239, "500876123-15", 'F', nota_p1, nota_p2, nota_p3);
	
		entrada.close();
		
		x1.Imprime_aluno();
		x1.Imprime_sexo();
		x1.Media_aluno();
		x1.Imprime_media();
		x1.Resultado();
		
		x2.Imprime_aluno();
		x2.Imprime_sexo();
		x2.Media_aluno();
		x2.Imprime_media();
		x2.Resultado();		
	}
}
