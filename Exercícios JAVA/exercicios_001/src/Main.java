import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cod1, cod2, quan1, quan2;
        double valor1, valor2;

        cod1 = sc.nextInt();
        quan1 = sc.nextInt();
        valor1 = sc.nextDouble();

        cod2 = sc.nextInt();
        quan2 = sc.nextInt();
        valor2 = sc.nextDouble();

        double tot = (quan1 * valor1) + (quan2 * valor2);

        System.out.printf("O valor total foi de: %.2f", tot);

        sc.close();
    }
}