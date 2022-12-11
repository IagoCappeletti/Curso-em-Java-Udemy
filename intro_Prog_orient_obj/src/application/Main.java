package application;

import java.util.Locale;
import java.util.Scanner;

import entites.Triangulo;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangulo x, y;
		x = new Triangulo();
		y = new Triangulo();

		System.out.println("Digite 3 numeros para o triangulo X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();

		System.out.println("Digite 3 numeros para o triangulo Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		double areaX = x.area();	
		double areaY = y.area();

		System.out.printf("Triangulo X area : %.4f%n", areaX);
		System.out.printf("Triangulo y area : %.4f%n", areaY);

		if (areaX > areaY) {
			System.out.println("O triangulo maior é: X");
		} else {
			System.out.println("O triangulo maior é: Y");
		}
		sc.close();
	}
}
