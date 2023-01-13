package application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int [][] mat = new int [n][n];

        for (int i = 0; i < mat.length; i++){
            for (int a = 0; i < mat[i].length; a++){
                mat[i][a] = sc.nextInt();
            }
        }

        System.out.println("Diagonal principal: ");
            for (int i = 0; i < mat.length; i++){
                System.out.print(mat[i][i] + " ");
            }

            System.out.println();
            int cont = 0;
            for (int i = 0; i < mat.length; i ++) {
                for (int a = 0; i < mat[i].length; a++) {
                    if (mat[i][a] < 0) {
                        cont++;
                    }
                }
            }

            System.out.println("Números negativos = " + cont);

        sc.close();
    }
}