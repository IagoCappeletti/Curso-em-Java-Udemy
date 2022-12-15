import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int senha;
        senha = sc.nextInt();

        while (senha != 2002) {
            System.out.println(senha);
            System.out.println("SENHA INVALIDA!");
            senha = sc.nextInt();
        }
        System.out.print("SENHA CORRETA!");
        sc.close();
    }
}