package Programa;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double soma, media;

        double [] vect = new double[n];
        for (int i = 0; i < n; i++){
            System.out.print("Digite um múmero: ");
            vect[i] = sc.nextDouble();
        }

        soma = 0.0;
        for (int i = 0; i < n; i++) {
            soma += vect[i];
        }

        media = soma / n;

        System.out.println();
        System.out.print("VALORES = ");
        for (int i = 0; i < n; i++){
            System.out.printf("%.1f ", vect[i]);
        }

        System.out.printf("%nSoma: %.2f%n", soma);
        System.out.printf("Media: %.2f%n", media);

        sc.close();
    }
}