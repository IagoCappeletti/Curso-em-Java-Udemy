package application;

import java.util.*;

public class ExSet {
    public static void main(String[] args) {

        Set<String> set = new LinkedHashSet<>();

        set.add("Monitor");
        set.add("Teclado");
        set.add("Mouse");
        set.add("SSD");

        set.removeIf(x -> x.charAt(0) == 'M');

        for (String p : set) {
            System.out.println(p);
        }
    }
}
