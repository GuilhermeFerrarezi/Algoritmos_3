package aula1;

public class Teste_aluno {

	public static void main(String[] args) {
		Aluno x1 = new Aluno("Paulo", 5515, "800912345-12", 'M', 7.0, 6.0, 8.0);
		Aluno x2 = new Aluno("Ana", 991239, "500876123-15", 'F', 2.0, 6.0, 9.0);
		
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
