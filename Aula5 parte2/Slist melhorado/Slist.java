package teste2;

public class Slist {
	int size = 0;
	Node head = null;
	
	public Slist(int item) {
		Node x = new Node(item);
		this.size = 1;
		this.head = x;
	}
	
	public Slist() {
		Node x = new Node();
		this.size = 1;
		this.head = x;
	}
	
	public void Insere_Node_Inicio(int item) {
		Node x = new Node(item);
		x.next = this.head;
		this.head = x;
		this.size++;
	}
	
	public void Insere_Node_Inicio() {
		Node x = new Node();
		x.next = this.head;
		this.head = x;
		this.size++;
	}
	
	public void Insere_Node_Fim(int item) {
		Node no_trab = this.head;
		while(no_trab.next != null) {
			no_trab = no_trab.next;
		}
		Node x = new Node(item);
		no_trab.next = x;
		this.size++;
	}
	
	public void Insere_Node_Fim() {
		Node no_trab = this.head;
		while(no_trab.next != null) {
			no_trab = no_trab.next;
		}
		Node x = new Node();
		no_trab.next = x;
		this.size++;
	}
	
	public void Imprime_Lista() {
		Node no_trab = this.head;
		while(no_trab != null) {
			System.out.print(" " + no_trab.item);
			no_trab = no_trab.next;
		}
	}
	
	public void Deleta_Primeiro_Node() {
		this.head = this.head.next;
		this.size--;
	}
	
	public void Deleta_Ultimo_Node() {
		Node no_trab = this.head;
		while(no_trab.next.next != null) {
			no_trab = no_trab.next;
		}
		no_trab.next = null;
		this.size--;
	}
	
	public void Imprime_Item_Primeiro_Node() {
		System.out.print(" " + this.head.item);
	}
	
	public void Imprime_Item_Ultimo_Node() {
		Node no_trab = this.head;
		while(no_trab.next != null) {
			no_trab = no_trab.next;
		}
		System.out.print(" " + no_trab.item);
	}
	
	public void Imprime_Item_Node_Posicao(int idx) {
		if(idx > this.size) {
			return;
		}
		Node no_trab = this.head;
		for(int count = 1;no_trab != null; count++) {
			if(count == idx) {
				System.out.print(" " + no_trab.item);
				break;
			}
			no_trab = no_trab.next;
		}
	}
}
