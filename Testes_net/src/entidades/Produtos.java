package entidades;

public class Produtos {

	public String nome;
	public double preco;
	public int quantidade;
	
	public  double totalValorEmStoque();{
		return preco * quantidade;
	}
	public  void AddProdutos(int quantidade); {
	
	}
	public  void RemoveProdutos(int quantidade); {
		
	}
}
