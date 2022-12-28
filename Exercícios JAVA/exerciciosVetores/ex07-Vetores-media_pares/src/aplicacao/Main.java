package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int somapar = 0, npares= 0;
        double mediapares;

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        int [] vetor = new int[n];
        for (int i = 0; i < n; i++){
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++){
            if (vetor[i] % 2 == 0) {
                somapar += vetor[i];
                npares++;
            }
        }

        if (npares == 0){
            System.out.print("NENHUM NUMERO PAR");
        }else {
            mediapares = (double)somapar / npares;
            System.out.printf("Média dos pares = %.1f%n", mediapares);
        }

        sc.close();
    }
}