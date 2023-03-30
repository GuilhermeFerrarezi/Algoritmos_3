package uscs3;

public class fila_Int {
	
	int[] fila;
	int fim;
	
	public fila_Int(int qtd) {
		fila = new int[qtd];
		fim = -1;
	}
	
	public void insert_Int(int item) {
		if(this.fim == fila.length-1) {
			System.out.println("Fila cheia");
		}else {
			this.fim++;
			fila[this.fim] = item;
		}
	}
	
	public void remove() {
		int[] trab = new int[this.fila.length];
		if(this.fim == -1) {
			System.out.println("Fila vazia");
		}else {
			for(int i = 0; i <= this.fim; i++) {
				if(i == this.fim) {
					continue;
				}
				trab[i] = this.fila[i + 1];
			}
			this.fim--;
			this.fila = trab;
		}
	}
	
	public void imprime_Fila() {
		if(this.fim == -1) {
			System.out.println("Fila vazia");
		}else {
			for(int i = 0; i <= this.fim; i ++) {
				System.out.printf("%d ", this.fila[i]);
			}
			System.out.println();
		}
	}
}
