package application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int [][] mat = new int [m][n];
        for (int i = 0; i < mat.length; i++) {
            for (int a = 0; a < mat[i].length; a++) {
                mat[i][a] = sc.nextInt();
            }
        }

        int x = sc.nextInt();

        for (int i = 0; i < mat.length; i++) {
            for (int a = 0; i < mat[i].length; a++) {
                if (mat[i][a] == x) {
                    System.out.println("Posição " + i + ", " + a + ": ");
                    if (a > 0) {
                        System.out.println("Left: " + mat[i][a-1]);
                    }
                    if (i > 0) {
                        System.out.println("Up: " + mat[i-1][a]);
                    }
                    if (a < mat[i].length-1) {
                        System.out.println("Right: " + mat[i][a+1]);
                    }
                    if (i < mat.length-1) {
                        System.out.println("Down: " + mat[i+1][a]);
                    }
                }
            }
         }

        sc.close();
    }
}