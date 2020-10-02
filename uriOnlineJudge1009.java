package processamentoDeDados;

import java.util.Scanner;

public class uriOnlineJudge1009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas 
		efetuadas por ele no mês (em dinheiro). Sabendo que este vendedor 
		ganha 15% de comissão sobre suas vendas efetuadas, informar o total a receber no final do mês, com duas casas decimais.*/
		
		String nomeVendedor;
		double salarioFixo, totalVendasFeitas, salarioFinal;
		
		Scanner teclado = new Scanner(System.in);
		
		nomeVendedor = teclado.next();
		salarioFixo = teclado.nextDouble();
		totalVendasFeitas = teclado.nextDouble();
		
		
		salarioFinal = salarioFixo + (totalVendasFeitas * 15.0 / 100) ;
		
		
		System.out.printf("TOTAL = R$ %.2f%n", salarioFinal);
		
		
		
		teclado.close();
		

	}

}
