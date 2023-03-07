package teste;

public class Node {
	
	int item;
	Node next;
	
	public Node() {
		this.item = 0;
		this.next = null;
	}
	
	public Node(int item) {
		this.item = item;
		this.next = null;
	}
	
	public void Imprime_Lista() {
		Node no_trab = new Node();
		no_trab = this;
		while(no_trab != null) {
			System.out.print(" " + no_trab.item);
			no_trab = no_trab.next;
		}
	}
	
	public void Insert_Item(int item) {
		Node no_trab = new Node(item);
		no_trab.next = this.next;
		this.next = no_trab;
	}
	
	public void Deleta_Proximo_item() {
		this.next = this.next.next;
	}
	
	public void Altera_Item(int item) {
		this.item = item;
	}
}
