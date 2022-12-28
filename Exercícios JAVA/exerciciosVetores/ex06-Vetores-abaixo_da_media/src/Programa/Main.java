package Programa;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double mediaVet = 0;
        double mediatot = 0;

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        double [] vetor = new double[n];
        for (int i = 0; i < n; i++){
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextDouble();
        }

        for (int i = 0; i < n; i++) {
            mediatot += vetor[i];
        }
        mediaVet = mediatot / n;
        System.out.printf("\nMEDIA DO VETOR = %.3f%n", mediaVet);

        System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
        for (int i =0; i < n; i++){
            if (vetor[i] < mediaVet){
                System.out.println(vetor[i]);
            }
        }
        sc.close();
    }
}