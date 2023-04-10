package prova6;

public class Main {
	
	public static void main(String[] args) {
		DList d = new DList(4);
		d.delete_first();
		d.insere_inicio(5);
		d.insere_inicio(4);
		d.insere_fim(6);
		d.insere_fim(7);
		d.imprime_first();
		d.imprime_last();
		d.imprime_lista();
		d.imprime_lista2();
		d.delete_first();
		d.delete_last();
		d.imprime_lista();
		System.out.println(d.mediaLista());
		d.dobra_valores();
		d.imprime_lista();
		System.out.println(d.retorna_segundo_item());
		if(d.search_lista(d.retorna_segundo_item())) {
			Integer[] i = d.gera_array();
			for(Integer I : i) {
				System.out.printf("%d ", I);
			}
			System.out.println();
		}
	}
}
