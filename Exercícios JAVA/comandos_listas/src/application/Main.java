package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Laura");
        list.add("Amanda");
        list.add("Iago");
        list.add("Carlos");
        list.add(2, "Marcia");

        System.out.println(list.size());

        for (String x: list) {
            System.out.println(x);
        }

        System.out.println("--------------------------");

        list.remove(1); // ou list.remove("Laura");
        list.removeIf(x -> x.charAt(0) == 'M'); /*função Lambda (PREDICADO Pois me retorna um vdd ou falso)
        pega a função x e me retorna se o charAt for igual a M*/
        for (String x: list) {
            System.out.println(x);
        }

        System.out.println("--------------------------");

        System.out.println("Index of Carlos" + list.indexOf("Carlos"));
        System.out.println("Index of Maria" + list.indexOf("Maria"));
        System.out.println("--------------------------");

        System.out.println("Apenas com a letra A");
        List<String> resultado = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        for (String x: resultado) {
            System.out.println(x);
        }

        System.out.println("--------------------------");
        String nome = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(nome);
        String nome1 = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null + " Não tem");
        System.out.println(nome1);
    }
}