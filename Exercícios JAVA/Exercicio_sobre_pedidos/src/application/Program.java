package application;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities_enum.OrderStatus;

public class Program {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter client data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.next());
        
        Client client = new Client(name, email, birthDate);

        System.out.println("Enter order data: ");
        System.out.println("PENDING_PAYMENT | PROCESSING | SHIPPED |DELIVERED");
        System.out.print("Status: ");

        OrderStatus status = OrderStatus.valueOf(sc.next()); // valueOf converte o String para o valor definido no OrderStatus

        Order order = new Order(new Date(), status, client);
        
        System.out.print("How many items to this order? ");
        int N = sc.nextInt();
        for(int i = 1; i <= N; i++){
            System.out.println("Enter #" + 1 + " item data: ");
            System.out.print("Product name: ");
            sc.nextLine();
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            Double productPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            int productQuantity = sc.nextInt();

            Product product = new Product(productName, productPrice);
            OrderItem it = new OrderItem(productQuantity, productPrice, product);
            order.addItem(it); //Adicionei ao order o item intanciado acima

        }

        System.out.println();
        System.out.println(order);

        sc.close();
    }
}
