import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int maior = max(a,b,c);
        mostreNaTela(maior);
        sc.close();
    }
    public static int max(int a,int b, int c) {
        int aux;
        if (a > b && a > c){
            aux = a;
        } else if (b > c) {
            aux = b;
        } else {
            aux = c;
        }
        return aux;
    }

    public static void mostreNaTela (int maior){
        System.out.print("O maior número digitado foi: " + maior);
    }
}