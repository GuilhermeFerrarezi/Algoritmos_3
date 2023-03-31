package teste5;

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
	
	public void imprime_Lista() {
		Node no_trab = this;
		while(no_trab != null) {
			System.out.printf("%d ", no_trab.item);
			no_trab = no_trab.next;
		}
		System.out.println();
	}
	
	public void insert_item(int item) {
		Node no_trab = this;
		Node no_trab2 = new Node(item);
		while(no_trab.next != null) {
			no_trab = no_trab.next;
		}
		no_trab.next = no_trab2;
	}
	
	public void deleta_proximo_item() {
		this.next = this.next.next;
	}
	
	public void altera_item(int item) {
		this.item = item;
	}
	
	public static void main(String[] args) {
		
		Node n1  = new Node(8);
		Node n2 = new Node(5);
		Node n3 = new Node(9);
		
		n1.next = n2;
		n2.next = n3;
		n1.imprime_Lista();
		n1.deleta_proximo_item();
		n1.imprime_Lista();
		n1.insert_item(7);
		n1.imprime_Lista();
	}
	
}
