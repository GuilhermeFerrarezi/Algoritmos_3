package prova6;

public class DList {
	
	int size;
	DListNode head;
	DListNode tail;
	
	public DList() {
		this.size = 0;
		this.head = null;
		this.tail = null;
	}
	
	public DList(DListNode node) {
		this.size = 1;
		this.head = node;
		this.tail = node;
	}
	
	public DList(int item) {
		DListNode no_trab = new DListNode(item);
		this.size = 1;
		this.head = no_trab;
		this.tail = no_trab;
	}
	
	public void imprime_first() {
		if(this.size == 0) {
			System.out.println("Lista vazia");
		}else {
			System.out.println(this.head.item);
		}
	}
	
	public void imprime_last() {
		if(this.size == 0) {
			System.out.println("Lista vazia");
		}else {
			System.out.println(this.tail.item);
		}
	}
	
	public void insere_fim(int item) {
		DListNode no_trab = new DListNode(item);
		if(this.size == 0) {
			this.head = no_trab;
			this.tail = no_trab;
		}else {
			no_trab.prev = this.tail;
			this.tail.next = no_trab;
			this.tail = no_trab;
		}
		this.size++;
	}
	
	public void insere_inicio(int item) {
		DListNode no_trab = new DListNode(item);
		if(this.size == 0) {
			this.head = no_trab;
			this.tail = no_trab;
		}else {
			no_trab.next = this.head;
			this.head.prev = no_trab;
			this.head = no_trab;
		}
		this.size++;
	}
	
	public void imprime_lista() {
		DListNode no_trab = this.head;
		if(this.size == 0) {
			System.out.println("Lista vazia");
		}else {
			for(int i = 0; i < this.size; i++) {
				System.out.printf("%d ", no_trab.item);
				no_trab = no_trab.next;
			}
			System.out.println();
		}
	}
	
	public void imprime_lista2() {
		DListNode no_trab = this.tail;
		if(this.size == 0) {
			System.out.println("Lista vazia");
		}else {
			for(int i = 0; i < this.size; i ++) {
				System.out.printf("%d ", no_trab.item);
				no_trab = no_trab.prev;
			}
		System.out.println();
		}
	}
	
	public void delete_first() {
		if(this.size == 0) {
			System.out.println("Lista vazia");
			return;
		}else if(this.size == 1) {
			this.head = null;
			this.tail = null;
		}else {
			this.head.next.prev = null;
			this.head = this.head.next;
		}
		this.size--;
	}
	
	public void delete_last() {
		if(this.size == 0) {
			System.out.println("Lista vazia");
			return;
		}else if(this.size == 1) {
			this.head = null;
			this.tail = null;
		}else {
			this.tail.prev.next = null;
			this.tail = this.tail.prev;
		}
		this.size--;
	}
	
	public Double mediaLista() {
		DListNode no_trab = this.head;
		double media = 0;
		if(this.size == 0) {
			System.out.println("Lista vazia");
			return null;
		}else {
			for(int i = 0; i < this.size; i++) {
				media += no_trab.item;
				no_trab = no_trab.next;
			}
		}
		return media / this.size;
	}
	
	public void dobra_valores() {
		DListNode no_trab = this.head;
		if(this.size == 0) {
			System.out.println("Lista vazia");
		}else {
			for(int i = 0; i < this.size; i++) {
				no_trab.item *= 2;
				no_trab = no_trab.next;
			}
		}
	}
	
	public Integer retorna_segundo_item() {
		if(this.size < 2) {
			System.out.println("Lista curta demais");
			return null;
		}else {
			return this.head.next.item;
		}
	}
	
	public Integer[] gera_array() {
		Integer[] arr = new Integer[this.size];
		DListNode no_trab = this.head;
		if(this.size == 0) {
			System.out.println("Lista vazia");
			return null;
		}else {
			for(int i = 0; i < this.size; i++) {
				arr[i] = no_trab.item;
				no_trab = no_trab.next;
			}
			return arr;
		}
	}
	
	public boolean search_lista(int vlr) {
		DListNode no_trab = this.head;
		for(int i = 0; i < this.size; i++) {
			if(no_trab.item == vlr) {
				return true;
			}
			no_trab = no_trab.next;
		}
		return false;
	}
}
