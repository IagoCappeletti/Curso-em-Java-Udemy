import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    Locale.setDefault(Locale.US);

    triangulos x, y; //Variavel tringulo do tipo x e y
    x = new triangulos(); //instanciar / criar o objeto
    y = new triangulos();

    System.out.println("Digite os valores dos lados dos triangulos: ");
    x.A = sc.nextDouble();
    x.B = sc.nextDouble(); //Para ler o Nº inteiro e guardar no atributo B no Objeto X
    x.C = sc.nextDouble(); //Basta colocar o Obejeto x. e escolher o atributo que quer acessar

    System.out.println("Digite os valores dos lados dos triangulos: ");
    y.A = sc.nextDouble();
    y.B = sc.nextDouble();
    y.C = sc.nextDouble();

    double areaX = x.area();//chamei o metodo que vai calcular a area de ada triangulo
    double areaY = y.area();

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