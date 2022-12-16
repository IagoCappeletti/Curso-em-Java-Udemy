import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) { //

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do Raio: ");
        double raio = sc.nextDouble();

        double c = calculadora.circuferencia(raio);
        double v = calculadora.volume(raio);


        System.out.printf("circunfência: %.2f%n", c);
        System.out.printf("Volume: %.2f%n",v);
        System.out.printf("Valor do PI: %.2f%n", calculadora.PI);
        sc.close();
    }


}