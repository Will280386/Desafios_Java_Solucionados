package processamentoDeDados;
import java.util.Locale;
import java.util.Scanner;


public class uriOnlineJudge1002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			double area, pi, raio;
			
			
			pi= 3.14159;
			raio = sc.nextDouble();
			area = pi * Math.pow(raio , 2);
			System.out.printf("A=%.4f%n", area);
				
		sc.close();		

	}

}
