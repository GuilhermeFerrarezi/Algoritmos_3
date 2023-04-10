package p_node;

public class Main {
	
	public static void main(String[] args) {

		Node n1 = new Node(8);
		Node n2 = new Node(5);
		Node n3 = new Node(9);
		
		n1.next = n2;
		n2.next = n3;
		
		n1.imprime_Lista();
		n1.deleta_Proximo();
		n1.imprime_Lista();
		n3.insert_item(7);
		n1.imprime_Lista();
	}
}
