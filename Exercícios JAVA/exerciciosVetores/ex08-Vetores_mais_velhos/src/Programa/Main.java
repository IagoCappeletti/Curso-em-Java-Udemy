package Programa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas vai querer digitar? ");
        int n = sc.nextInt();

        String [] nomes = new String[n];
        int [] idades = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Dados da " + (i+1) + "a pessoa: ");
            System.out.print("Nome: ");
            nomes[i] = sc.next();
            System.out.print("Idade: ");
            idades[i] = sc.nextInt();
        }

        int maioridade = idades[0];
        int posicaomaior = 0;

        for (int i = 0; i < n; i++) {
            if (idades[i] > maioridade) {
                maioridade = idades[i];
                posicaomaior = i;
            }
        }

        System.out.printf("PESSOA MAIS VELHA: %s \n", nomes[posicaomaior]);

        sc.close();
    }
}