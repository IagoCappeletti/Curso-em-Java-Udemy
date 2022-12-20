package aplicacao;
import entidade.Conta;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Conta conta;

        System.out.print("Digite o numero da conta: ");
        int numero = sc.nextInt();
        System.out.print("Digite o seu nome: ");
        sc.nextLine();
        String nome = sc.nextLine();
        System.out.print("existe um depÃ³sito inicial (S/N): ");
        char res = sc.next().charAt(0);
        if (res == 'S') {
            System.out.print("Digite o valor do deposito inicial: ");
            double depositoInicial = sc.nextDouble();
            conta = new Conta(numero, nome, depositoInicial);
        } else {
            conta = new Conta(numero, nome);
        }

        System.out.println();
        System.out.println("Dados da conta: ");
        System.out.println(conta.toString());

        System.out.println();
        System.out.print("Digite o valor do depÃ³sito: ");
        double depositoValor = sc.nextDouble();
        conta.deposio(depositoValor);
        System.out.println("Atualizaões da conta!");
        System.out.println(conta);

        System.out.println();
        System.out.println("Digite o valor pra saque: ");
        double saquValor = sc. nextDouble();
        conta.sacar(saquValor);
        System.out.println("Atualizaões da conta!");
        System.out.println(conta);

        sc.close();
    }
}