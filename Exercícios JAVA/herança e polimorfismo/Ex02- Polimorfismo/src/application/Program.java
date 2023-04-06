package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> list = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            System.out.println("Product #" + i + "data:");
            System.out.print("Common, used of imported (c/u/i)? ");
            char res = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Price: ");
            Double price = sc.nextDouble();
            if (res == 'c'){
                Product prod = new Product(name, price);
                list.add(prod);
            } else if (res == 'u'){
                System.out.print("Manufacture date (DD/MM/YYYY: ");
                LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                list.add(new UsedProduct(name, price, date));
            } else {
                System.out.print("Customs fee: ");
                double customsFee = sc.nextDouble();
                Product prod = new ImportedProduct(name, price, customsFee );
                list.add(prod);
            }
        }

        System.out.println();
        System.out.println("PRICE TAGS: ");
        for (Product prod: list){
            System.out.println(prod.priceTag());
        }

        sc.close();
    }
}
