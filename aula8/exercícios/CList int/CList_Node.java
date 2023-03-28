package teste4;

public class CList_Node {
	
	int item;
	CList_Node next;
	CList_Node prev;
	
	public CList_Node() {
		
		this.next = null;
		this.prev = null;
		
	}
	
	public CList_Node(int item) {
		
		this.item = item;
		this.next = null;
		this.prev = null;
		
	}
}
