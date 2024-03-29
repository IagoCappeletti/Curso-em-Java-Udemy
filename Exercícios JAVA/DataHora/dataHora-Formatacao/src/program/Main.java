package program;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {


        //CONVERTENDO DATA-HORA PARA TEXTO

        LocalDate d01 = LocalDate.parse("2022-01-16");
        LocalDateTime d02 = LocalDateTime.parse("2022-01-16T01:30:26");
        Instant d03 = Instant.parse("2022-01-16T01:30:26Z");

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        //objeto de formatação "fmt3" com o padrão "dd/MM/yyyy HH:mm" e considerando o fuso horário do sistema do usuário.
        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;

        System.out.println("d01 = "+ d01);
        System.out.println("d01 = "+ d01.format(fmt1));
        System.out.println("d01 = "+ fmt1.format(d01));
        System.out.println("d01 = "+ d01.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println();
        System.out.println("d01 = "+ d02.format(fmt1));
        System.out.println("d02 = "+ d02.format(fmt2));
        System.out.println();
        System.out.println("d03 = "+ fmt3.format(d03));
        System.out.println();
        System.out.println("d02 = "+ d02.format(fmt4));
        System.out.println("d02 = "+ fmt5.format(d03)); //Imprimi formato Iso
        System.out.println("d01 = "+ d03); //Imprimi formato Iso
        System.out.println("d01 = "+ d03.toString()); //Imprimi formato Iso


    }
}