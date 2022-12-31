import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String [] vect = new String[] {"Maria", "Bob", "Alex"};

        for (int i = 0; i < vect.length; i++) {
            System.out.println(vect[i]);
        }

        System.out.println("=======================");

        for (String nomes: vect) { //Para cada objeto NOMES contido no vetor vect, faça!
            System.out.println(nomes);
        }
        sc.close();
    }
}