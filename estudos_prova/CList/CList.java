package prova7;

public class CList {
	
	int size;
	CListNode head;
	
	public CList() {
		this.size = 0;
		this.head = new CListNode();
	}
	
	public void imprime_first() {
		if(this.size == 0 ) {
			System.out.println("Lista vazia");
		}else {
			System.out.println(this.head.next.item);
		}
	}
	
	public void imprime_last() {
		if(this.size == 0) {
			System.out.println("Lista vazia");
		}else {
			System.out.println(this.head.prev.item);
		}
	}
	
	public void insere_first(int item) {
		CListNode no_trab = new CListNode(item);
		if(this.size == 0) {
			this.head.next = no_trab;
			this.head.prev = no_trab;
			no_trab.next = this.head;
			no_trab.prev = this.head;
		}else {
			no_trab.next = this.head.next;
			no_trab.prev = this.head;
			this.head.next.prev = no_trab;
			this.head.next = no_trab;
		}
		this.size++;
	}
	
	public void insere_last(int item) {
		CListNode no_trab = new CListNode(item);
		if(this.size == 0) {
			no_trab.next = this.head;
			no_trab.prev = this.head;
			this.head.next = no_trab;
			this.head.prev = no_trab;
		}else {
			no_trab.prev = this.head.prev;
			no_trab.next = this.head;
			this.head.prev.next = no_trab;
			this.head.prev = no_trab;
		}
		this.size++;
	}
	
	public void imprime_lista() {
		CListNode no_trab = this.head.next;
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
	
	public void delete_first() {
		if(this.size == 0) {
			System.out.println("Lista vazia");
			return;
		}else if(this.size == 1) {
			this.head.prev = this.head;
			this.head.next = this.head;
		}else {
			this.head.next.next.prev = this.head;
			this.head.next = this.head.next.next;
		}
		this.size--;
	}
	
	public void delete_last() {
		if(this.size == 0) {
			System.out.println("Lista vazia");
			return;
		}else if(this.size == 1) {
			this.head.prev = this.head;
			this.head.next = this.head;
		}else {
			this.head.prev.prev.next = this.head;
			this.head.prev = this.head.prev.prev;
		}
		this.size--;
	}
	
	public Double media_lista() {
		double media = 0;
		CListNode no_trab = this.head.next;
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
		CListNode no_trab = this.head.next;
		if(this.size == 0) {
			System.out.println("Lista vazia");
			return;
		}else {
			for(int i = 0; i < this.size; i++) {
				no_trab.item *= 2;
				no_trab = no_trab.next;
			}
		}
	}
	
	public Integer retorna_segundo_item() {
		if(this.size < 2) {
			System.out.println("Lista não é cumprida o suficiente");
			return null;
		}else {
			return this.head.next.next.item;
		}
	}
	
	public Integer[] gera_array() {
		CListNode no_trab = this.head.next;
		Integer[] arr = new Integer[this.size];
		if(this.size == 0) {
			System.out.println("Lista vazia");
			return null;
		}else {
			for(int i = 0; i < this.size; i++) {
				arr[i] = no_trab.item;
				no_trab = no_trab.next;
			}
		}
		return arr;
	}
	
	public boolean search_lista(int vlr) {
		CListNode no_trab = this.head.next;
		if(this.size == 0) {
			System.out.println("Lista vazia");
		}else {
			for(int i = 0; i < this.size; i++) {
				if(no_trab.item == vlr) {
					return true;
				}
				no_trab = no_trab.next;
			}
		}
		return false;
	}
}
