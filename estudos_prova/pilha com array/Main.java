package prova8;

public class Main {
	
	public static void main(String[] args) {
		Pilha_int x = new Pilha_int(3);
		x.imprime_pilha();
		x.push(9);
		x.push(4);
		x.push(3);
		x.imprime_pilha();
		x.pop();
		x.imprime_pilha();
		x.pop();
		x.imprime_pilha();
		x.pop();
		x.imprime_pilha();
		x.pop();
	}
}
