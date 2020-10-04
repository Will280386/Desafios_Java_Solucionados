package processamentoDeDados;

import java.util.Scanner;

public class ExercicioCondicionais1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		int numero;
		System.out.println("Entre com o número");
		numero = teclado.nextInt();
		
		
		if (numero < 0) {
			
			System.out.println("NEGATIVO");
			
		}
		
		else {
			System.out.println("NÂO NEGATIVO");
		}
		
		
		
		
		
		teclado.close();
		
		

	}

}
