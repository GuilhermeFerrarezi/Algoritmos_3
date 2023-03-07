package teste;

public class Main {

	public static void main(String[] args) {
		Node n1 = new Node(8);
		Node n2 = new Node(5);
		Node n3 = new Node(9);
		n1.next = n2;
		n2.next = n3;
		n1.Imprime_Lista();
		n1.Deleta_Proximo_item();
		n1.Imprime_Lista();
		n1.next.Insert_Item(7);
		n1.Imprime_Lista();
	}
}
