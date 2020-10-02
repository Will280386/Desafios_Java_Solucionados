package processamentoDeDados;
import java.util.Locale;
import java.util.Scanner;

public class uriOnlineJudge1006 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		double A, B, C;
		double pesoA, pesoB, pesoC, media;
		Locale.setDefault(Locale.US);
		
		pesoA = 2.0;
		pesoB = 3.0;
		pesoC = 5.0;
		
		Scanner teclado = new Scanner(System.in);
		
		A = teclado.nextDouble();
		B = teclado.nextDouble();
		C = teclado.nextDouble();
		
		media = ((A * pesoA) + (B * pesoB) + (C * pesoC)) / 10.0;
		
		
		System.out.printf("MEDIA = %.1f%n", media);
		
		teclado.close();
		
		
		
	}

}
