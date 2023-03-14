package uscs;

public class DList {

	int size;
	DListNode head;
	DListNode tail;
	
	public DList(int item) {
		DListNode no_trab = new DListNode(item);
		this.size = 1;
		this.head = no_trab;
		this.tail = no_trab;
	}
	
	public DList() {
		this.size = 0;
		this.head = null;
		this.tail = null;
	}
	
	public void imprime_First() {
		System.out.println(this.head.item);
	}
	
	public void imprime_Last() {
		System.out.println(this.tail.item);
	}
	
	public void insereFim(int item) {
		DListNode no_trab = new DListNode(item);
		no_trab.prev = this.tail;
		this.tail = no_trab;
		this.size++;
	}
	
	public void insereInicio(int item) {
		DListNode no_trab = new DListNode(item);
		no_trab.next = this.head;
		this.head = no_trab;
		this.size++;
	}
	
	public void imprimeLista() {
		DListNode no_trab = this.head;
		for(int i = 0; i < this.size; i++) {
			System.out.println(no_trab.item);
			no_trab = no_trab.next;
		}
	}
	
	public void imprimeLista2() {
		DListNode no_trab = this.tail;
		for(int i = this.size; i > 0; i--) {
			System.out.println(no_trab.item);
			no_trab = no_trab.prev;
		}
		
	}
	
	public void deleteFirst() {
		this.head = this.head.next;
		this.head.prev = null;
		this.size--;
	}
	
	public void deleteLast() {
		this.tail = this.tail.prev;
		this.tail.next = null;
		this.size--;
	}
	
	public double MediaLista() {
		double media = 0;
		DListNode no_trab = this.head;
		for(int i = 0; i < this.size; i++) {
			media += no_trab.item;
			no_trab = no_trab.next;
		}
		return media/this.size;
	}
	
	public void DobraValores() {
		DListNode no_trab = this.head;
		for(int i = 0; i < this.size; i++) {
			no_trab.item *= 2;
			no_trab = no_trab.next;
		}
	}
	
	public Integer RetornaSegundoItem() {
		if(this.size < 2) {
			return null;
		}else {
			return this.head.next.item;
		}
	}
	
	public DListNode[] GeraArray() {
		DListNode[] no_trab = new DListNode[this.size];
		DListNode no_trab2 = this.head;
		for(int i = 0; i < this.size; i++) {
			no_trab[i] = no_trab2;
			no_trab2 = no_trab2.next;
		}
		return no_trab;
	}
	
	public boolean SearchLista(int valor) {
		DListNode no_trab = this.head;
		for(int i = 0; i < this.size; i++) {
			if(no_trab.item == valor) {
				return true;
			}
			no_trab = no_trab.next;
		}
		return false;
	}
}
