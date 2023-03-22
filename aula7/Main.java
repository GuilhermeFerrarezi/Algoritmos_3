package uscs2;

public class Main {
	
	public static void main(String[] args) {
		
		CList lista = new CList();
		lista.insereFirst(9);
		lista.insereFirst(12);
		lista.insereLast(22);
		lista.imprimeLista();
		lista.imprimeFirst();
		lista.imprimeLast();
		lista.deleteLast();
		lista.deleteFirst();
		lista.imprimeLista();
		CListNode[] arr = lista.geraArray();
		if(lista.searchLista(9)) {
			lista.imprimeLista();
		}
		for(CListNode node : arr) {
			System.out.printf("%d ", node.item);
		}
		System.out.println();
		lista.insereFirst(25);
		lista.insereFirst(68);
		int  i = lista.retornaSegundoItem();
		System.out.println(i);
		lista.dobraValores();
		lista.imprimeLista();
	}
}
