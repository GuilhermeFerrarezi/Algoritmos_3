package uscs3;

public class Main {
	
	public static void main(String[] args) {

		fila_Int_Lista f = new fila_Int_Lista();
		f.imprime_Fila();
		
		f.insert(3);
		f.imprime_Fila();
		
		f.insert(4);
		f.imprime_Fila();
		
		f.insert(5);
		f.imprime_Fila();
		
		f.insert(6);
		f.imprime_Fila();
		
		f.remove();
		f.imprime_Fila();
		
		f.remove();
		f.imprime_Fila();
		
		f.remove();
		f.imprime_Fila();
		
		f.remove();
		f.imprime_Fila();
		
		f.remove();
		f.imprime_Fila();
	}
}
