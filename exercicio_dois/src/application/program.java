package application;

import java.util.Locale;
import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee emp = new Employee();
		
		System.out.println("Name: ");
		emp.name = sc.nextLine();
		
		System.out.println("Gross salary: ");
		emp.grossSalary = sc.nextDouble();
		
		System.out.println("Tax: ");
		emp.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee: " + emp);
		System.out.println();
		System.out.println("which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		emp.increaseSalaty(percentage); //passar como parametro para  att o produto
		
		System.out.println();
		System.out.println("Employee: " + emp);

		sc.close();
	}

}
