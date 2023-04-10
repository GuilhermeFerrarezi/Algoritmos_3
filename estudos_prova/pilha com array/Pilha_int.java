package prova8;

public class Pilha_int {
	
	int[] pilha;
	int topo;
	
	public Pilha_int(int n) {
		this.pilha = new int[n];
		this.topo = -1;
	}
	
	public void push(int item) {
		if(this.topo >= this.pilha.length - 1) {
			System.out.println("Stack overflow");
			return;
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
			return this.pilha[this.topo + 1];
		}
	}
	
	public void imprime_pilha() {
		if(this.topo == -1) {
			System.out.println("Pilha vazia");
			return;
		}else {
			for(int i  = this.topo; i >= 0; i--) {
				System.out.printf("%d ", this.pilha[i]);
			}
		System.out.println();
		}
	}
}
