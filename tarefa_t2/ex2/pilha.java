package tarefa_t2;

public class pilha {
	
	int size;
	Node head;
	Node tail;
	
	public pilha() {
		this.size = 0;
		this.head = null;
		this.tail = null;
	}
	
	public void push(char item) {
		Node no_trab = new Node(item);
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
	
	public Character pop() {
		char retorno;
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
	
	public boolean palindrome() {
		pilha p1 = new pilha();
		pilha p2 = new pilha();
		Node no_trab = this.head;
		Node no_trab2;
		int p1_size;
		if(this.size == 0) {
			return false;
		}
		for(int i = 0; i < this.size; i++) {
			p1.push(no_trab.item);
			no_trab = no_trab.next;
		}
		p1_size = p1.size;
		for(int i = 0; i < p1_size; i++) {
			p2.push(p1.pop());
		}
		no_trab = this.head;
		no_trab2 = p2.head;
		for(int i = 0; i < this.size; i++) {
			if(no_trab.item == no_trab2.item) {
				no_trab = no_trab.next;
				no_trab2 = no_trab2.next;
				continue;
			}else {
				return false;
			}
		}
		return true;
	}
	
	public void imprime_pilha() {
		Node no_trab = this.head;
		if(this.size == 0) {
			System.out.println("Lista vazia");
		}else {
			while(no_trab != null) {
				System.out.printf("%c", no_trab.item);
				no_trab = no_trab.next;
			}
			System.out.println();
		}
	}
}
