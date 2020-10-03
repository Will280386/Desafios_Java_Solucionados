package processamentoDeDados;
import java.util.Scanner;

public class uriOnlineJudge1011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		double raio, pi, vol;
		
		pi =3.14159;
		
		Scanner teclado = new Scanner (System.in);
		
		raio = teclado.nextInt();
		
		vol = (4.0 / 3.0) * pi * Math.pow(raio, 3);
		
		System.out.printf("VOLUME = %.3f%n", vol);
		
		teclado.close();

	}

}
