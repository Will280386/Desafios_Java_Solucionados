package processamentoDeDados;

import java.util.Locale;
import java.util.Scanner;

public class uriOnlineJudge1008 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int funcionarios;
		int horasTrabalhadas;
		double valorPorHora, salarioTotal;
		
		Locale.setDefault(Locale.US);
		
		
		Scanner teclado = new Scanner(System.in);
		
		funcionarios = teclado.nextInt();
		horasTrabalhadas = teclado.nextInt();
		valorPorHora = teclado.nextDouble();
		
		
		salarioTotal = horasTrabalhadas * valorPorHora;
		
		System.out.println("NUMBER = " + funcionarios);
		System.out.printf("SALARY = U$ %.2f%n", salarioTotal);
		
		
		
		teclado.close();

	}

}
