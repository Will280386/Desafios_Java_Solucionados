package processamentoDeDados;
import java.util.Locale;
import java.util.Scanner;

public class uriOnlineJudge1012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double A, B, C, pi;
		double triangulo, circulo, trapezio, quadrado, retangulo;
		Locale.setDefault(Locale.US);
		
		pi = 3.14159;
		
		Scanner teclado = new Scanner(System.in);
		
		A = teclado.nextDouble();
		B = teclado.nextDouble();		
		C = teclado.nextDouble();
		
		triangulo = (A * C) / 2.0;
		circulo = pi * Math.pow(C, 2.0);
		trapezio = ((A + B) * C) / 2.0;
		quadrado = B * B;
		retangulo = A * B;
		
		System.out.printf("TRIANGULO: %.3f%n", triangulo);
		System.out.printf("CIRCULO: %.3f%n", circulo);
		System.out.printf("TRAPEZIO: %.3f%n", trapezio);
		System.out.printf("QUADRADO: %.3f%n", quadrado);
		System.out.printf("RETANGULO: %.3f%n", retangulo);
		
	
		teclado.close();
		
		
		
	}

}
