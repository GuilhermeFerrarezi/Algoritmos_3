package uscs3;

public class fila_Int_Lista {
	
	int fim;
	fila_Int_Node head;

	public fila_Int_Lista() {
		
		fila_Int_Node sentinela = new fila_Int_Node();
		this.fim = 0;
		sentinela.next = sentinela;
		sentinela.prev = sentinela;
		this.head = sentinela;
		
	}
	
	public void insert(int item) {
		fila_Int_Node no_trab = new fila_Int_Node(item);
		if(this.fim == 0) {
			this.head.prev = no_trab;
			this.head.next = no_trab;
			no_trab.next = this.head;
			no_trab.prev = this.head;
		}else{
			no_trab.next = this.head;
			no_trab.prev = this.head.prev;
			this.head.prev.next = no_trab;
			this.head.prev = no_trab;
		}
		this.fim++;
	}
	
	public void remove() {
		if(this.fim == 0) {
			System.out.println("Fila vazia");
			return;
		}else if(this.fim == 1) {
			this.head.next = this.head;
			this.head.prev = this.head;
		}else {
			this.head.next.next.prev = this.head;
			this.head.next = this.head.next.next;
		}
		this.fim--;
	}
	
	public void imprime_Fila() {
		fila_Int_Node no_trab = this.head.next;
		if(this.fim == 0) {
			System.out.println("Fila vazia");
		}else {
			for(int i = 0; i < this.fim; i++) {
				System.out.printf("%d ", no_trab.item);
				no_trab = no_trab.next;
			}
			System.out.println();
		}
	}
}
