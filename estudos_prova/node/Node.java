package p_node;

public class Node {
	
	int item;
	Node next;
	
	public Node(int item) {
		this.item = item;
		this.next = null;
	}
	
	public Node() {
		this.item = 0;
		this.next = null;
	}
	
	public void imprime_Lista() {
		Node no_trab = this;
		while(no_trab != null) {
			System.out.printf("%d ", no_trab.item);
			no_trab = no_trab.next;
		}
		System.out.println();
	}
	
	public void insert_item(int item) {
		Node no_trab = new Node(item);
		no_trab.next = this.next;
		this.next = no_trab;
	}
	
	public void deleta_Proximo() {
		this.next = this.next.next;
	}
		
	public void altera_item(int item) {
		this.item = item;
	}
}
