package teste2;

public class Main {
	
	public static void main(String[] args) {
		Slist slist = new Slist();
		slist.Insere_Node_Inicio(8);
		slist.Insere_Node_Fim(10);
		slist.Imprime_Lista();
		System.out.println(" ");
		slist.Insere_Node_Inicio(5);
		slist.Imprime_Item_Node_Posicao(2);
		System.out.println(" ");
		slist.Imprime_Lista();
		System.out.println(" ");
		slist.Imprime_Item_Primeiro_Node();
		System.out.println(" ");
		slist.Imprime_Item_Ultimo_Node();
		System.out.println(" ");
		slist.Deleta_Primeiro_Node();
		slist.Deleta_Ultimo_Node();
		slist.Imprime_Lista();
	}
}
