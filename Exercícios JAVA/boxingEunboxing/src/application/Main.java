package application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = 20;

        Integer obj = x;

        System.out.println(obj);

        int y = obj;

        System.out.print(y * 2);

        sc.close();
    }
}