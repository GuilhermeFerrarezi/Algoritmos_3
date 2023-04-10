package prova7;

public class Main {
	
	public static void main(String[] args) {
		CList s = new CList();
		s.insere_first(2);
		s.insere_last(3);
		s.insere_first(1);
		s.insere_last(4);
		s.imprime_first();
		s.imprime_last();
		s.imprime_lista();
		s.delete_first();
		s.imprime_lista();
		s.delete_last();
		s.imprime_lista();
		System.out.println(s.media_lista());
		s.dobra_valores();
		s.imprime_lista();
		System.out.println(s.retorna_segundo_item());
		if(s.search_lista(s.retorna_segundo_item())) {
			Integer[] i = s.gera_array();
			for(Integer I : i) {
				System.out.printf("%d ", I);
			}
			System.out.println();
		}
	}
}
