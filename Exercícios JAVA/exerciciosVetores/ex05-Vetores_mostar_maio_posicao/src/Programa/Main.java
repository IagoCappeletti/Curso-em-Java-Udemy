package Programa;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int posmaior;
        double maior;

        System.out.print("Quantos numeros voce vai digitar?");
        int n = sc.nextInt();

        double [] vect = new double[n];

        for (int i = 0; i < n; i++){
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();
        }

        maior = vect[0];
        posmaior = 0;

        for (int i = 0; i < n; i++){
            if (vect[i] > maior) {
                maior = vect[i];
                posmaior = i;
            }
        }

        System.out.println();
        System.out.printf("Maior valor = %.2f", maior);
        System.out.printf("%nPosição do maior valor = %d", posmaior);

    }
}