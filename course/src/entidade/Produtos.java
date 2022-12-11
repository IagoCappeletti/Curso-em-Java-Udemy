package entidade;

public class Produtos {

	public static double valorDolar;
	public static double quantosDolar;
	
	
	public static double total() {
		return valorDolar * quantosDolar;
	}
	public static double iof(double total) {
		return total * 6 /100;
	}
	public static double totalIof(double total, double iof) {
		return total + iof;
	}
}

