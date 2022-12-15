import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    Locale.setDefault(Locale.US);

    double xA, xB, xC, yA, yB, yC;

    System.out.println("Digite os valores dos lados dos triangulos: ");
    xA = sc.nextDouble();
    xB = sc.nextDouble();
    xC = sc.nextDouble();

    System.out.println("Digite os valores dos lados dos triangulos: ");
    yA = sc.nextDouble();
    yB = sc.nextDouble();
    yC = sc.nextDouble();

    double p = (xA + xB + xC) / 2.0;
    double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));

    p = (yA + yB + yC) / 2.0;
    double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));

    System.out.printf("O triangulo X tem a area de : %.4f%n", areaX);
    System.out.printf("O triangulo y tem a area de : %.4f%n", areaY);

    if (areaX > areaY) {
        System.out.println("A maior area é do triangulo X");
    } else {
        System.out.println("A maior area é do triangulo Y");
    }
    sc.close();
    }
}