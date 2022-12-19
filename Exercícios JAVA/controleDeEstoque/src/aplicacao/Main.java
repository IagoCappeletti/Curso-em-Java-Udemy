package aplicacao;

import java.util.Locale;
import java.util.Scanner;
import  entidade.Produtos;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


         Produtos p = new Produtos();

        System.out.println("Digite os dados do produto: ");
        System.out.print("Digite o Nome: ");
        String nome = sc.nextLine(); //leio o nome e guardo dentro variavel produto no campo nome
        System.out.print("Dgite o preço: ");
        double preco = sc.nextDouble();

        Produtos produtos = new Produtos(nome, preco); /*Agora o programador é obrigado a informar
         os dados do produto na instanciação dele */

        produtos.setNome("Computador");
        System.out.println("Atualização nome: " + produtos.getNome());
        produtos.setPreco(1200.00);
        System.out.println("Atualização do preco: " + produtos.getPreco());

        System.out.println();
        System.out.println("Dados do produto: " + produtos.toString()); // Não é nescessário colocar o .toString()
        System.out.println();
        System.out.print("Digite a quantidade de produtos que queira adicionar no estoque: ");
        int quantidade = sc.nextInt();
        produtos.adicionarProdutos(quantidade); //passei a quantidade no metodo adicionarProdutos.

        System.out.println();
        System.out.println("Dados do produto: " + produtos.toString());
        System.out.println();

        System.out.println("Digite a quantidade de produtos para retirar do estoque: ");
        quantidade = sc.nextInt();
        produtos.removerProdutos(quantidade);

        System.out.println();
        System.out.println("Dados do produto: " + produtos.toString());

        sc.close();
    }
}