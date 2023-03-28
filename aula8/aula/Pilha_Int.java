package uscs2;

public class Pilha_Int {
	
	int[] pilha;
	int topo;
	
	public Pilha_Int(int tamanho) {
		this.pilha = new int[tamanho];
		this.topo = -1;
	}
	
	public void push(int item) {
		if(this.topo >= this.pilha.length - 1) {
			System.out.println("Stack Overflow");
		}else {
			this.topo++;
			this.pilha[topo] = item;
		}
	}
	
	public Integer pop() {
		if(this.topo == -1) {
			System.out.println("Pilha vazia");
			return null;
		}else {
			this.topo--;
			return this.pilha[topo + 1];
		}
	}
	
	public void imprime_Pilha_contrario() {
		if(this.topo == -1) {
			System.out.println("Pilha vazia");
			return;
		}else {
			for(int i = 0; i <= this.topo; i++) {
				System.out.printf("%d ", this.pilha[i]);
			}
			System.out.println();			
		}
	}
	
	public void imprime_Pilha() {
		if(this.topo == -1) {
			System.out.println("Pilha vazia");
			return;
		}else {
			for(int i = topo; i >= 0; i--) {
				System.out.printf("%d ", this.pilha[i]);
			}
			System.out.println();
		}
	}
}
