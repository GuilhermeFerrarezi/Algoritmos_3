package uscs3;

public class fila_Int_Node {
	
	int item;
	fila_Int_Node next;
	fila_Int_Node prev;
	
	public fila_Int_Node() {
		
		this.item = 0;
		this.next = null; 
		this.prev = null;
		
	}
	
	public fila_Int_Node(int item) {
		
		this.item = item;
		this.next = null;
		this.prev = null;
		
	}
}
