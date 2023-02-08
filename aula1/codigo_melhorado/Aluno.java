package aula1;

import java.util.Arrays;

public class Aluno {

	String nome;
	int codmat;
	String cpf;
	char sexo;
	double nota_P1;
	double nota_P2;
	double nota_P3;
	double media;
	static int qtd_notas = 3;

	public Aluno(String nome, int codmat, String cpf, char sexo, double nota_P1, double nota_P2, double nota_P3) {
		this.nome = nome;
		this.codmat = codmat;
		this.cpf = cpf;
		this.sexo = sexo;
		this.nota_P1 = nota_P1;
		this.nota_P2 = nota_P2;
		this.nota_P3 = nota_P3;
	}
	
	public Aluno(String nome, int codmat, String cpf, char sexo) {
		this.nome = nome;
		this.codmat = codmat;
		this.cpf = cpf;
		this.sexo = sexo;
	}

	public void Imprime_aluno() {
		System.out.println(this.nome + ' ' + this.codmat + ' ' + this.cpf + ' ' + this.sexo + ' ' + this.nota_P1 + ' ' + this.nota_P2 + ' ' + this.nota_P3 + "\n");
	}

	public void Imprime_sexo() {
		if (this.sexo == 'M') {
			System.out.println(this.nome + " - " + "Masculino\n");
		}else if (this.sexo == 'F') {
			System.out.println(this.nome + " - "  + "Feminino\n");
		}
	}

	public void Media_aluno() {
		double[] notas = new double[qtd_notas];
		notas[0] = this.nota_P1;
		notas[1] = this.nota_P2;
		notas[2] = this.nota_P3;
		Arrays.sort(notas);
		this.media = (notas[1] + notas[2]) / 2;
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
