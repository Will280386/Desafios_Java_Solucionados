package processamentoDeDados;
import java.util.Scanner;

public class uriOnlineJudge1010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int codPeca1, numeroPeca1, codPeca2, numeroPeca2; 
		double valorPeca1, valorPeca2, totalAPagar1, totalAPagar2, pagFinal;
		
		
		Scanner teclado = new Scanner(System.in);
	
		codPeca1 = teclado.nextInt();
		numeroPeca1 = teclado.nextInt();
		valorPeca1 = teclado.nextDouble();
		
		codPeca2 = teclado.nextInt();
		numeroPeca2 = teclado.nextInt();
		valorPeca2 = teclado.nextDouble();
		
		
		totalAPagar1 = (double) numeroPeca1 * valorPeca1; 
		totalAPagar2 = (double)numeroPeca2 * valorPeca2;
		
		pagFinal = totalAPagar1 + totalAPagar2;
		
	
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", pagFinal); 
		
	
		
		teclado.close();

	}

}
