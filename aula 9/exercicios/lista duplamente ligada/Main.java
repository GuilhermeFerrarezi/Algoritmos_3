package teste7;

public class Main {
	
	public static void main(String[] args) {
		fila_D f = new fila_D();
		f.enqueue(1);
		f.enqueue(2);
		f.enqueue(3);
		f.imprimeFila();
		f.dequeue();
		f.imprimeFila();
		f.dequeue();
		f.imprimeFila();
		f.dequeue();
		f.imprimeFila();
		f.dequeue();
		f.imprimeFila();
	}
}
