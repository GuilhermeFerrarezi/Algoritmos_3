package tarefa_t2;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		pilha p1 = new pilha();
		
		System.out.println("Entre com a palavra:");
		String palavra = entrada.nextLine();
		for(int i  = 0; i < palavra.length(); i++){
			p1.push(palavra.charAt(i));
		}
		
		if(p1.palindrome()) {
			System.out.println("A palavra é uma palíndrome");
		}else {
			System.out.println("A palavra não é uma palíndrome");
		}
		entrada.close();
	}
}
