package prova9;

public class Fila_int {
	
	int[] fila;
	int fim;
	
	public Fila_int(int n) {
		this.fila = new int[n];
		this.fim = -1;
	}
	
	public void insert(int item) {
		int[] arr = new int[this.fila.length];
		if(this.fim  >= this.fila.length - 1) {
			System.out.println("Fila cheia");
			return;
		}else {
			for(int i = 0; i <= this.fim; i++) {
				arr[i + 1] = this.fila[i];
			}
			arr[0] = item;
			this.fila = arr;
			this.fim++;
		}
	}
	
	public Integer remove() {
		if(this.fim == -1) {
			System.out.println("Fila vazia");
			return null;
		}else {
			this.fim--;
			return this.fila[this.fim + 1];
		}
	}
	
	public void imprime_fila() {
		if(this.fim == -1) {
			System.out.println("Fila vazia");
			return;
		}else {
			for(int i = this.fim; i >= 0; i--) {
				System.out.printf("%d ", fila[i]);
			}
			System.out.println();
		}
	}
}
