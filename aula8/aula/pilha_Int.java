package teste4;

public class pilha_Int {
	
	int topo;
	CList_Node head;
	
	public pilha_Int() {
		CList_Node sentinela = new CList_Node();
		this.topo = 0;
		this.head = sentinela;
		this.head.prev = this.head;
		this.head.next = this.head;
	}
	
	public void imprime_pilha() {
		CList_Node no_trab = this.head.prev;
		if(this.topo == 0){
			System.out.println("Lista vazia");
		}else {
			for(int i = 0; i < this.topo; i++) {
				System.out.printf("%d ", no_trab.item);
				no_trab = no_trab.prev;
			}
			System.out.println();
		}
	}
	
	public void push(int item) {
		CList_Node no_trab = new CList_Node(item);
		if(this.topo == 0) {
			this.head.next = no_trab;
			this.head.prev = no_trab;
			no_trab.next = this.head;
			no_trab.prev = this.head;
		}else {
			no_trab.next = this.head;
			no_trab.prev = this.head.prev;
			this.head.prev = this.head.prev.prev;
			this.head.prev = no_trab;
		}
		this.topo++;
	}
	
	public Integer pop() {
		int item = this.head.prev.item;
		if(this.topo == 0) {
			System.out.println("Lista vazia");
			return null;
		}else if(this.topo == 1) {
			this.head.prev = this.head;
			this.head.next = this.head;
			this.topo--;
		}else {
			this.head.prev.prev.next = this.head;
			this.head.prev = this.head.prev.prev;
			this.topo--;
		}
		return item;
	}
}
