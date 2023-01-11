package aplicacao;

import entidade.Reservas;

import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Reservas [] vect = new Reservas[10];

        System.out.print("Quantos quartos de hotel vai querer reservar? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println();
            System.out.println("Aluguel #" + i);
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.next();
            System.out.print("Nº do quarto: ");
            int quarto = sc.nextInt();

            vect[quarto] = new Reservas(nome, email); //instanciando o OBJ e atribuindo a
            // referencia dele ao vetor na posição quarto.

        }

        System.out.println();
        System.out.println("Quartos alugados: ");
        for (int i = 0; i < 10; i ++) {
            if (vect[i] != null) {
                System.out.println(i  + ": " + vect[i]);
            }
        }

        System.out.println();
        System.out.println("Quartos Disponiveis: ");
        for (int i = 0; i < 10; i++){
            if (vect[i] == null){
                System.out.println(i + ": " + vect[i]);
            }
        }

        sc.close();
    }
}