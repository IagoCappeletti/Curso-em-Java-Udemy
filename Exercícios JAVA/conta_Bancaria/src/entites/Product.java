package entites;

public class Product {

	private String nomeDoUsuario;
	private int numeroDaConta;
	private double deposito;

	public Product(String nomeDoUsuario, int numeroDaConta) {
		this.nomeDoUsuario = nomeDoUsuario;
		this.numeroDaConta = numeroDaConta;
	}

	public Product(String nomeDoUsuario, int numeroDaConta, double depositoInicial) {
		this.nomeDoUsuario = nomeDoUsuario;
		this.numeroDaConta = numeroDaConta;
		deposito(depositoInicial);
	}

	public String getNomeDoUsuario() {
		return nomeDoUsuario;
	}

	public void setNomeDoUsuario(String nomeDoUsuario) {
		this.nomeDoUsuario = nomeDoUsuario;
	}

	public int getNumeroDaConta() {
		return numeroDaConta;
	}

	public double getDeposito() {
		return deposito;
	}

	public void deposito(double conta) {
		this.deposito += conta;
	}

	public void removerDeposito(double conta) {
		this.deposito -= conta + 5.0;
	}

	public String toString() {
		return "Numero da conta: " + numeroDaConta + ", Nome: " + nomeDoUsuario + ", Seu saldo é: " + String.format("$ %.2f", deposito);
	}
}