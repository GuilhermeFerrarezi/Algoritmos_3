package uscs2;

public class Main {
	
	public static void main(String[] args) {
		
		Pilha_Int x = new Pilha_Int(3);
		x.imprime_Pilha();
		x.push(9);
		x.push(4);
		x.push(3);
		
		x.imprime_Pilha_contrario();
		x.imprime_Pilha();
		
		x.pop();
		x.imprime_Pilha();
		
		x.pop();
		x.imprime_Pilha();
		
		x.pop();
		x.imprime_Pilha();
	}
}
