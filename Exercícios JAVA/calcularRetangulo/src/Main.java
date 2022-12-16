import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Retangulo retangulo = new Retangulo();

        System.out.println("Digite a largura e altura do retangulo: ");
        retangulo.largura = sc.nextDouble();
        retangulo.altura = sc.nextDouble();

        System.out.printf("AREA: %.2f%n", retangulo.area());
        System.out.printf("PERIMETRO: %.2f%n",retangulo.perimetro());
        System.out.printf("Diagonal: %.2f%n", retangulo.diagonal());


        sc.close();
    }
}