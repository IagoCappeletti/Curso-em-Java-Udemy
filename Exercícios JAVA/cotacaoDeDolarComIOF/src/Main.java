import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Calculadora calc = new Calculadora();

        System.out.println("Qual a cotação do Dolar? ");
        calc.cotacaoDolar = sc.nextDouble();

        System.out.println("Qual a qunatidade de dolar? ");
        calc.quantidadeDolar = sc.nextDouble();



        double total = calc.total();
        double iof = calc.iof(total);
        double totalIof = calc.totIof(total, iof);

        System.out.printf("valor a ser pago em reais %.2f%n", totalIof);

        sc.close();
    }
}