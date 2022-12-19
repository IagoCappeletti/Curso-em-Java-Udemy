package entidade;

public class Produtos {

    private String nome;
    private double preco;
    private int quantidade;

    public Produtos() { //Construtor padrão
    }
    public Produtos (String nome, double preco, int quantidade) { //Construtor
        this.nome = nome; //this estou me referindo ao atributo do Objeto
        this.preco = preco;
        this.quantidade = quantidade;
    }
    public Produtos (String nome, double preco ) { //Construtor
        this.nome = nome;
        this.preco = preco;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
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
