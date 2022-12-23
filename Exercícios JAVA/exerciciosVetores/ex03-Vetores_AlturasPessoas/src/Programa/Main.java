package Programa;


import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();

        String[] nomes = new String[n];
        int[] idades = new int[n];
        Double[] alturas = new Double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Dados da " + (i + 1) + "a pessoa:");
            System.out.print("Nome: ");
            nomes[i] = sc.next();
            System.out.print("idade: ");
            idades[i] = sc.nextInt();
            System.out.print("altura: ");
            alturas[i] = sc.nextDouble();
        }

        double soma = 0.0;
        for (int i = 0; i < n; i++) {
            soma += alturas[i];
        }

        double mediaAlturas = soma / n;

        System.out.println();
        System.out.printf("Altura média: %.2f%n",mediaAlturas);

        int menores = 0;
        for (int i = 0; i < n; i++) {
            if (idades[i] < 16) {
                menores += 1;
            }
        }

        double porcetagemIdade = menores * 100.0 / n;

        System.out.printf("Pessoa com menos de 16 anos: %.1f%%%n", porcetagemIdade);

        for (int i = 0; i < n; i++) {
            if (idades[i] < 16) {
               System.out.println(nomes[i]);
            }
        }

        sc.close();

    }
}
