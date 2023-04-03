package teste7;

public class fila_D {
	
	int size;
	DListNode head;
	DListNode tail;
	
	public fila_D() {
		this.size = 0;
		this.head = null;
		this.tail = null;
	}
	
	public void enqueue(int item) {
		DListNode no_trab = new DListNode(item);
		if(this.size == 0) {
			this.head = no_trab;
			this.tail = no_trab;
		}else {
			this.tail.next = no_trab;
			no_trab.prev = this.tail;
			this.tail = no_trab;
		}
		this.size++;
	}
	
	public Integer dequeue() {
		int trab;
		if(this.size == 0) {
			System.out.println("Fila vazia");
			return null;
		}else if(this.size == 1) {
			trab = this.head.item;
			this.head = null;
			this.tail = null;
		}else {
			trab = this.head.item;
			this.head = this.head.next;
			this.head.prev = null;
		}
		this.size--;
		return trab;
	}
	
	public void imprimeFila() {
		DListNode no_trab = this.head;
		if(this.size == 0) {
			System.out.println("Fila vazia");
		}else {
			while(no_trab != null) {
				System.out.printf("%d ", no_trab.item);
				no_trab = no_trab.next;
			}
			System.out.println();
		}
	}
}
