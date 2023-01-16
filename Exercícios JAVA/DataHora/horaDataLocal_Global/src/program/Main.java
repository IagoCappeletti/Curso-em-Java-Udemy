package program;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate d01 = LocalDate.now(); //DataHora de Agora
        LocalDateTime d02 = LocalDateTime.now(); //DataHora de Agora
        Instant d03 = Instant.now(); //DataHora de Agora

        LocalDate d04 = LocalDate.parse("2022-07-20"); //Iso 8601 -> DataHora
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:36"); //Iso 8601 -> DataHora
        Instant d06 = Instant.parse("2022-07-20T01:30:36Z"); //Iso 8601 -> DataHora
        Instant d07 = Instant.parse("2022-07-20T01:30:36-03:00"); //Iso 8601 -> DataHora

        LocalDate d08 = LocalDate.parse("20/07/2022", fmt1); //Texto Formatado Custumizado -> DataHora
        LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2); //Texto Formatado Custumizado -> DataHora

        LocalDate d10 = LocalDate.of(2022,1,16); //Dia, mês, ano [horário] -> DataHoraLocal
        LocalDateTime d11 = LocalDateTime.of(2022,1,16,11,6); //Dia, mês, ano [horário] -> DataHoraLocal

        System.out.println("d01 = " + d01);
        System.out.println("d02 = " + d02);
        System.out.println("d03 = " + d03);
        System.out.println();
        System.out.println("d04 = " + d04);
        System.out.println("d05 = " + d05);
        System.out.println("d06 = " + d06);
        System.out.println("d07 = " + d07);
        System.out.println();
        System.out.println("d08 = " + d08);
        System.out.println("d09 = " + d09);
        System.out.println("d10 = " + d10);
        System.out.println("d11 = " + d11);
        sc.close();
    }
}