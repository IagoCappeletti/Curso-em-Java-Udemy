package Programa;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números quer digitar?");
        int n = sc.nextInt();

        int [] vect = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();
        }

        System.out.println("%nNUMEROS PARES: ");

        int quantidadePar = 0;
        for (int i = 0; i < n; i++){
            if (vect[i] % 2 == 0){
                System.out.printf("%d ", vect[i]);
                quantidadePar++;
            }
        }

        System.out.printf("%n%nQuantidade de pares = %d%n", quantidadePar);

        sc.close();
    }
}