package processamentoDeDados;
import java.util.Locale;
import java.util.Scanner;


public class uriOnlineJudge1005 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double A, B, media;
		Locale.setDefault(Locale.US);
		
		
		Scanner teclado = new Scanner(System.in);
		
		A = teclado.nextDouble();
		B = teclado.nextDouble();
		
		media = ((A * 3.5) + (B * 7.5)) / 11;
		
		System.out.printf("MEDIA = %.5f%n", media);
		
		teclado.close();
	}

}
