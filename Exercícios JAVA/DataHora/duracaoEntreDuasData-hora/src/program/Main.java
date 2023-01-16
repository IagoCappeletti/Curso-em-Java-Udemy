package program;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {

        LocalDate d01 = LocalDate.parse("2022-01-16");
        LocalDateTime d02 = LocalDateTime.parse("2022-01-16T01:30:26");
        Instant d03 = Instant.parse("2022-01-16T01:30:26Z");

        LocalDate pastWeekLocalDate = d01.minusDays(7);
        LocalDate nextWeekLocalDate = d01.plusDays(7);

        System.out.println("Data original = " + d01);
        System.out.println("semanaPassada = " + pastWeekLocalDate);
        System.out.println("proximaSemana = " + nextWeekLocalDate);
        System.out.println();

        LocalDateTime pastWeekLocalDateTime = d02.minusDays(7);
        LocalDateTime nextWeekLocalDateTime = d02.plusDays(7);

        System.out.println("Data original = " + d02);
        System.out.println("pastWeekLocalDateTime = " + pastWeekLocalDateTime);
        System.out.println("nextWeekLocalDateTime = " + nextWeekLocalDateTime);
        System.out.println();

        Instant pastWeekInstant = d03.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = d03.plus(7, ChronoUnit.DAYS);

        System.out.println();
        System.out.println("Data original = " + d03);
        System.out.println("pastWeekInstant = " + pastWeekInstant);
        System.out.println("nextWeekInstant = " + nextWeekInstant);

        Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d01.atStartOfDay());
        /*LocalDate não tem informação de tempo, e não tem como calcular o tempo de duração entre dois LocalDate.
        Por isso tenho que converter eles para LocalDateTime */
        Duration t2 = Duration.between(pastWeekLocalDateTime, d02);
        Duration t3 = Duration.between(pastWeekInstant, d03);
        Duration t4 = Duration.between(d03, pastWeekInstant);
        Duration t5 = Duration.between(pastWeekInstant, d03);
        Duration t6 = Duration.between(pastWeekInstant, d03);
        Duration t7 = Duration.between(pastWeekInstant, d03);
        Duration t8 = Duration.between(pastWeekInstant, d03);

        System.out.println("t1 dias = " + t1.toDays());
        System.out.println("t2 dias = " + t2.toDays());
        System.out.println("t3 dias = " + t3.toDays());
        System.out.println("t4 dias = " + t4.toDays());
        System.out.println("t5 Hours = " + t5.toHours());
        System.out.println("t6 Minutes = " + t6.toMinutes());
        System.out.println("t7 Seconds = " + t7.toSeconds());
        System.out.println("t8 Millis = " + t8.toMillis());

    }
}