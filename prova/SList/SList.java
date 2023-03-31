package teste6;

public class SList {
	
	int size;
	Node head;
	
	public SList() {
		this.size = 0;
		this.head = null;
	}
	
	public void insere_node_inicio(int item) {
		Node no_trab = new Node(item);
		no_trab.next = this.head;
		this.head = no_trab;
		this.size++;
	}
	
	public void insere_node_fim(int item) {
		Node no_trab = this.head;		
		if(this.size == 0) {
			this.head = no_trab;
		}else {
			Node no_trab2 = new Node(item);
			for(int i = 1; i < this.size; i++){
				no_trab = no_trab.next;
			}
			no_trab.next = no_trab2;
		}
		this.size++;
	}
	
	public void imprime_lista() {
		Node no_trab = this.head;
		for(int i = 1; i <= this.size; i++) {
			System.out.printf("%d ", no_trab.item);
			no_trab = no_trab.next;
		}
		System.out.println();
	}
	
	public void deleta_primeiro_node() {
		this.head= this.head.next;
		this.size--;
	}
	
	public void deleta_ultimo_node() {
		Node no_trab = this.head;
		for(int i = 1; i <= this.size - 1; i++) {
			no_trab = no_trab.next;
		}
		no_trab.next = null;
		this.size--;
	}
	
	public void imprime_item_primeiro_node() {
		System.out.println(this.head.item);
	}
	
	public void imprime_item_ultimo_node() {
		Node no_trab = this.head;
		for(int i = 1; i < this.size; i++) {
			no_trab = no_trab.next;
		}
		System.out.println(no_trab.item);
	}
	
	public void imprime_item_node_posicao(int idx) {
		Node no_trab = this.head;
		for(int i = 1; i <= this.size; i++) {
			if(i == idx) {
				System.out.println(no_trab.item);
				return;
			}
			no_trab = no_trab.next;
		}
	}
	
	public static void main(String[] args) {
		SList x = new SList();
		x.insere_node_inicio(8);
		x.insere_node_fim(10);
		x.imprime_lista();
		x.insere_node_inicio(5);
		x.imprime_item_node_posicao(2);
		x.imprime_lista();
		x.imprime_item_primeiro_node();
		x.imprime_item_ultimo_node();
		x.deleta_primeiro_node();
		x.imprime_lista();
		x.deleta_ultimo_node();
		x.imprime_lista();
	}
}
