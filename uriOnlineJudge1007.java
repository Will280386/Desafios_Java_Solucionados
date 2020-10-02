package processamentoDeDados;

import java.util.Locale;
import java.util.Scanner;

public class uriOnlineJudge1007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Leia quatro valores inteiros A, B, C e D. A seguir, 
		 calcule e mostre a diferença do produto de A e B pelo produto de C e D 
		 segundo a fórmula: DIFERENCA = (A * B - C * D).*/
		
		
		int A, B, C, D, diferenca;
		Locale.setDefault(Locale.US);
		
		
		Scanner teclado = new Scanner(System.in);
		
		A = teclado.nextInt();
		B = teclado.nextInt();
		C = teclado.nextInt();
		D = teclado.nextInt();
		
		diferenca = (A * B) - (C * D);
		
		System.out.printf("DIFERENCA = %d%n", diferenca);
		
		
		
		
		
		teclado.close();
		
		
		
	}

}
