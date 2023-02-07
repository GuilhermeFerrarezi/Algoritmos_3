package aula1;

public class Aluno {

	String nome;
	int codmat;
	String cpf;
	char sexo;
	double nota_P1;
	double nota_P2;
	double nota_P3;
	double media;
	
	public Aluno(String nome, int codmat, String cpf, char sexo, double nota_P1,double nota_P2, double nota_P3) {
		this.nome = nome;
		this.codmat = codmat;
		this.cpf = cpf;
		this.sexo = sexo;
		this.nota_P1 = nota_P1;
		this.nota_P2 = nota_P2;
		this.nota_P3 = nota_P3;
	}
	
	public void Imprime_aluno() {
		System.out.println(this.nome + " " + this.codmat + " " + this.cpf + " " + this.sexo + " " + this.nota_P1 + " " + this.nota_P2 + " " + this.nota_P3 + "\n");
	}
	
	public void Imprime_sexo() {
		if (this.sexo == 'M') {
			System.out.println(this.nome + " " + "Masculino\n");
		}else if (this.sexo == 'F') {
			System.out.println(this.nome + " " + "Feminino\n");
		}
	}
	
	public void Media_aluno() {
		double maior = 0;
		double maior2 = 0;
		if (this.nota_P1 >= this.nota_P2 && this.nota_P1 >= this.nota_P3) {
			maior = this.nota_P1;
		}
		if (this.nota_P2 >= this.nota_P3 && this.nota_P2 >= this.nota_P1) {
			maior = this.nota_P2;
		}
		if (this.nota_P3 >= this.nota_P1 && this.nota_P3 >= this.nota_P2) {
			maior = this.nota_P3;
		}
		if (this.nota_P1 >= this.nota_P2 && this.nota_P1 >= this.nota_P3 && maior != this.nota_P1) {
			maior2 = this.nota_P1;
		}
		if (this.nota_P3 >= this.nota_P1 && this.nota_P3 >= this.nota_P2 && maior != this.nota_P2) {
			maior2 = this.nota_P2;
		}
		if (this.nota_P3 >= this.nota_P1 && this.nota_P3 >= this.nota_P2 && maior != this.nota_P3) {
			maior2 = this.nota_P3;
		}
		this.media = (maior + maior2)/2;
	}
	
	public void Resultado() {
		if (this.media >= 6) {
			System.out.println("Aprovado\n");
		}else {
			System.out.println("Reprovado\n");
		}
	}
	
	public void Imprime_media() {
		System.out.println(this.media + "\n");
	}
	
}
