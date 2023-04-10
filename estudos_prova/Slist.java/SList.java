package prova5;

public class SList {
	
	int size;
	Node head;
	
	public SList() {
		this.size = 0;
		this.head = null;
	}
	
	public void insere_Node_inicio(int item) {
		Node no_trab = new Node(item);
		if(this.size == 0) {
			this.head = no_trab;
		}else {
			no_trab.next = this.head;
			this.head = no_trab;
		}
		this.size++;
	}
	
	public void insere_Node_fim(int item) {
		Node no_trab = new Node(item);
		Node no_trab2 = this.head;
		if(this.size == 0) {
			this.head = no_trab;
		}else {
			while(no_trab2.next != null) {
				no_trab2 = no_trab2.next;
			}
			no_trab2.next = no_trab;
		}
		this.size++;
	}
	
	public void imprime_lista() {
		Node no_trab = this.head;
		for(int i = 0; i < this.size; i++) {
			System.out.printf("%d ", no_trab.item);
			no_trab = no_trab.next;
		}
		System.out.println();
	}
	
	public void deleta_primeiro_node() {
		if(this.size == 0) {
			System.out.println("Lista vazia");
		}else if(this.size == 1) {
			this.head = null;
		}else {
			this.head = this.head.next;
		}
		this.size--;
	}
	
	public void deleta_ultimo_node() {
		Node no_trab = this.head;
		for(int i = 1; i < this.size; i++){
			no_trab = no_trab.next;
		}
		no_trab.next = null;
		this.size--;
	}
	public void imprime_primeiro_item() {
		if(this.size == 0) {
			System.out.println("Lista vazia");
		}else {
			System.out.println(this.head.item);
		}
	}
	
	public void imprime_ultimo_item() {
		Node no_trab = this.head;
		if(this.size == 0) {
			System.out.println("Lista vazia");
		}else {
			for(int i = 1; i < this.size; i++) {
				no_trab = no_trab.next;
			}
			System.out.println(no_trab.item);
		}
	}
	
	public void imprime_item_idx(int idx) {
		Node no_trab = this.head;
		if(this.size == idx - 1) {
			System.out.println("Lista não possui esse indice");
		}else {
			for(int i = 1; i <= this.size; i++) {
				if(i == idx) {
					System.out.println(no_trab.item);
					return;
				}
				no_trab = no_trab.next;
			}
		}
	}
}
