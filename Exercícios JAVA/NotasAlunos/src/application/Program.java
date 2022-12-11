package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student stu = new Student();
		
		System.out.println("Nome: ");
		stu.Name = sc.nextLine();
		System.out.println("Primeira Nota: ");
		stu.Notas1 = sc.nextDouble();
		System.out.println("Segunda Nota: ");
		stu.Notas2 = sc.nextDouble();
		System.out.println("Terceira Nota: ");
		stu.Notas3 = sc.nextDouble();
		
		System.out.printf("NOTA FINAL: %.2f%n", stu.resultado());
		
		if (stu.resultado() < 60.0) {
			System.out.println("REPROVADO");
			System.out.printf("Ponto Faltantes %.2f POINTS%n", stu.pontosFalntantes());
		}
		else {
			System.out.println("APROVADO");
		}
		
		sc.close ();
	}

}
