public class Produtos {

    public String nome;
    public double preco;
    public int quantidade;

    public Produtos (String nome, double preco, int quantidade) { //Construtor
        this.nome = nome; //this estou me referindo ao atributo do Objeto
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public double totalNoEstoque (){
        return preco * quantidade;
    }

    public void adicionarProdutos (int quantidade) {
        this.quantidade += quantidade; /*Aqui temos uma ambiguidade e usei o this. para especificar que queria
        acessar o atributo da classe(o Objeto) e não o paremetro da função */
    }

    public void removerProdutos (int quantidade) {
        this.quantidade -= quantidade;
    }

    public String toString() {
        return nome + ", " + "$ " + String.format("%.2f", preco) + ", " + quantidade
                + "unidades, preço total é: " + String.format("%.2f",totalNoEstoque());
    }
}
