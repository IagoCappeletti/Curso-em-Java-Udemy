package application;

public class Main {
    public static void main(String[] args) {

        String [] vect = new String[] {"Maria, Iago, Amanda"};

        for (int i = 0; i < vect.length; i++){
            System.out.println(vect[i]);
        }

        System.out.println("=======================");

        for (String nomes: vect){
            System.out.println(nomes);
        }

    }
}