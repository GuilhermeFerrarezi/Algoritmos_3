package uscs;

public class Main {

	public static void main(String[] args) {
		
		DList x = new DList(12);
		DListNode[] a;
		x.insereInicio(41);
		x.insereFim(53);
		x.insereInicio(535);
		x.insereFim(6435);
		x.imprime_First();
		x.imprime_Last();
		System.out.println("");
		x.imprimeLista();
		System.out.println("");
		x.imprimeLista2();
		System.out.println("");
		x.DobraValores();
		x.imprimeLista();
		System.out.println("");
		x.RetornaSegundoItem();
		if (x.SearchLista(0)) {
			System.out.println("sim");
		}else {
			System.out.println("nao");
		}
		if (x.SearchLista(82)) {
			System.out.println("sim");
		}else {
			System.out.println("nao");
		}
		System.out.println("");
		x.imprimeLista();
		x.deleteFirst();
		x.deleteLast();
		System.out.println("");
		x.imprimeLista();
		System.out.println("");
		System.out.println(x.MediaLista());
		System.out.println("");
		a = x.GeraArray();
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i].item);
		}
		
	}
	
}
