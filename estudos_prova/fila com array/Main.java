package prova9;

public class Main {
	
	public static void main(String[] args) {
		Fila_int x = new Fila_int(3);
		x.imprime_fila();
		x.insert(9);
		x.insert(4);
		x.insert(3);
		x.imprime_fila();
		x.remove();
		x.imprime_fila();
		x.remove();
		x.imprime_fila();
		x.remove();
		x.imprime_fila();
		x.remove();
	}
}
