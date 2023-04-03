package teste7;

public class pilha_D {
	
	int size;
	DListNode head; 
	DListNode tail;
	
	public pilha_D() {
		this.size = 0;
		this.head = null;
		this.tail = null;
	}
	
	public void push(int item) {
		DListNode no_trab = new DListNode(item);
		if(this.size == 0) {
			this.head = no_trab;
			this.tail = no_trab;
		}else {
			this.tail.next = no_trab;
			no_trab.prev = this.tail;
			this.tail  = no_trab;			
		}
		this.size++;
	}
	
	public Integer pop() {
		int retorno;
		if(this.size == 0) {
			System.out.println("Lista vazia");
			return null;
		}else if(this.size == 1) {
			retorno = this.tail.item;
			this.head = null;
			this.tail = null;
		}else {
			retorno = this.tail.item;
			this.tail = this.tail.prev;
			this.tail.next = null;
		}
		this.size--;
		return retorno;
	}
	
	public void imprime_pilha() {
		DListNode no_trab = this.head;
		if(this.size == 0) {
			System.out.println("Lista vazia");
		}else {
			while(no_trab != null) {
				System.out.printf("%d ", no_trab.item);
				no_trab = no_trab.next;
			}
			System.out.println();
		}
	}
}
