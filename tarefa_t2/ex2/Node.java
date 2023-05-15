package tarefa_t2;

public class Node {
	char item;
	Node next;
	Node prev;
	
	public Node() {
		this.item = 0;
		this.next  = null;
		this.prev = null;
	}
	
	public Node(char item) {
		this.item = item;
		this.next = null;
		this.prev = null;
	}
}
