import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Produtos produtos = new Produtos();

        System.out.println("Digite os dados do produto: ");
        System.out.print("Digite o Nome: ");
        produtos.nome = sc.nextLine(); //leio o nome e guardo dentro variavel produto no campo nome
        System.out.print("Dgite o preço: ");
        produtos.preco = sc.nextDouble();
        System.out.print("Digite a quantidade que tem no estoque: ");
        produtos.quantidade = sc.nextInt();

        System.out.print("");
        System.out.println("Dados do produto: " + produtos.toString()); // Não é nescessário colocar o .toString()
        System.out.print("Digite a quantidade de produtos que queira adicionar no estoque: ");
        int quantidade = sc.nextInt();
        produtos.adicionarProdutos(quantidade); //passei a quantidade no metodo adicionarProdutos.

        System.out.print("");
        System.out.println("Dados do produto: " + produtos.toString());

        System.out.println("Digite a quantidade de produtos para retirar do estoque: ");
        quantidade = sc.nextInt();
        produtos.removerProdutos(quantidade);

        System.out.print("");
        System.out.println("Dados do produto: " + produtos.toString());

        sc.close();
    }
}