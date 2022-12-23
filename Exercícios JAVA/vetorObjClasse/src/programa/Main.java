package programa;

import entidade.Produto;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Produto[] vect = new Produto[n];

        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            String nome = sc.nextLine();
            double preco = sc.nextDouble();
            vect[i] = new Produto(nome, preco);
            //Leio os produtos, instanciar os objetos e guardar nas posições dos vetores
        }

        double soma = 0.0;
        for (int i = 0; i < vect.length; i++){
            soma += vect[i].getPreco(); //acessando o vetor na posição i e querendo acesar apenas o preço
        }

        double media = soma / vect.length;
        //envés de usar a variavel n, podemos usar o vect.length.
        //Pq evita ficar usando variaveis que não estão ligadas ao vetor.
        //Utilizando o vect.length fica mais coeso porque o vetor sabe o tamanho dele.

        System.out.printf("A média dos valores é: %.2f%n", media);

        sc.close();
    }
}