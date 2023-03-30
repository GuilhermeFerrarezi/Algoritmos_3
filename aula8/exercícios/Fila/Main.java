package uscs3;

public class Main {
	
	public static void main(String[] args) {
		fila_Int f = new fila_Int(3);
		f.imprime_Fila();
		
		f.insert_Int(3);
		f.imprime_Fila();
		
		f.insert_Int(4);
		f.imprime_Fila();
		
		f.insert_Int(5);
		f.imprime_Fila();
		
		f.insert_Int(6);
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
