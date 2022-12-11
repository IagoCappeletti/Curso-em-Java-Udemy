package application;

import java.util.Locale;
import java.util.Scanner;

import entidade.Produtos;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o preço do dolar? ");
		Produtos.valorDolar = sc .nextDouble();
		
		System.out.println("Quantos dolar vai comprar? ");
		Produtos.quantosDolar = sc.nextDouble();
		
		double total = Produtos.total();
		double iof = Produtos.iof(total);
		double totalIof = Produtos.totalIof(total, iof);
		
		System.out.printf("O total de dolar em reais vai dar:  %.2f%n", totalIof );
		
		sc.close();
	}

}
