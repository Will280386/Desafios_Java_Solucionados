package processamentoDeDados;

import java.util.Scanner;

public class exercicioCondicionais3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
		Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados 
		em ordem crescente ou decrescente.*/
		
		int A, B;
		
		Scanner teclado = new Scanner (System.in);
		
		A = teclado.nextInt();
		B = teclado.nextInt();
		
		
		if (A % B == 0 || B % A == 0) {
			System.out.println("São multiplos");
		}
		else {
			System.out.println("Não são multiplos");
		}
		
		
		
		teclado.close();
		
	}

}
