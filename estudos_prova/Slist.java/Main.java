package prova5;

public class Main {
	
	public static void main(String[] args) {
		SList x = new SList();
		x.insere_Node_inicio(8);
		x.insere_Node_fim(10);
		x.imprime_lista();
		x.insere_Node_inicio(5);
		x.imprime_item_idx(2);
		x.imprime_lista();
		x.imprime_primeiro_item();
		x.imprime_ultimo_item();
		x.deleta_primeiro_node();
		x.imprime_lista();
	}
}
