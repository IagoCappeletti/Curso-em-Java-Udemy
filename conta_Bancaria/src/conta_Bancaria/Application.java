package conta_Bancaria;

import java.util.Locale;
import java.util.Scanner;
import entites.Product;

public class Application {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Product Product;

		System.out.println("====== CONTA BANCARIA ======");
		System.out.print("Digite o número da conta: ");
		int numeroDaConta = sc.nextInt();
		System.out.print("Digite seu nome: ");
		sc.nextLine();
		String nomeDoUsuario = sc.nextLine();
		System.out.println();
		System.out.print("Você gostaria de depositar um valor na conta? (S/N)");
		char resposta = sc.next().charAt(0);
		if (resposta == 'S') {
			System.out.print("Digite o valor do deposito: ");
			double depositoInicial = sc.nextDouble();
			Product = new Product(nomeDoUsuario, numeroDaConta, depositoInicial);
		} else {
			Product = new Product(nomeDoUsuario, numeroDaConta);
		}

		System.out.println();
		System.out.println("Sua conta: ");
		System.out.print(Product);

		System.out.println();
		System.out.print("Digite o valor que deseja depositar: ");
		double valorDeposito = sc.nextDouble();
		Product.deposito(valorDeposito);
		System.out.println();
		System.out.println("Atualização da conta: ");
		System.out.println(Product);

		System.out.println();
		System.out.print("Digite o valor que deseja retirar: ");
		valorDeposito = sc.nextDouble();
		Product.removerDeposito(valorDeposito);
		System.out.println();
		System.out.println("Atualização da conta: ");
		System.out.println(Product);

		sc.close();
	}
}
