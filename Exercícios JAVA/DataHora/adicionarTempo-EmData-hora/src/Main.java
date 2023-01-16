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
        LocalDateTime nextWeekLocalDateTime00 = d02.plusWeeks(7);
        LocalDateTime nextWeekLocalDateTime0 = d02.plusMonths(7);
        LocalDateTime nextWeekLocalDateTime01 = d02.plusHours(7);
        LocalDateTime nextWeekLocalDateTime02 = d02.plusMinutes(7);
        LocalDateTime nextWeekLocalDateTime03 = d02.plusSeconds(7);
        LocalDateTime nextWeekLocalDateTime04 = d02.plusNanos(7);

        System.out.println("Data original = " + d02);
        System.out.println("pastWeekLocalDateTime = " + pastWeekLocalDateTime);
        System.out.println("nextWeekLocalDateTime = " + nextWeekLocalDateTime);
        System.out.println("plusWeeks = " + nextWeekLocalDateTime00);
        System.out.println("plusMonths = " + nextWeekLocalDateTime0);
        System.out.println("plusHours = " + nextWeekLocalDateTime01);
        System.out.println("plusMinutes = " + nextWeekLocalDateTime02);
        System.out.println("plusSeconds = " + nextWeekLocalDateTime03);
        System.out.println("plusNanos = " + nextWeekLocalDateTime04);
        System.out.println();

        Instant pastWeekInstant = d03.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = d03.plus(7, ChronoUnit.DAYS);

        System.out.println();
        System.out.println("Data original = " + d03);
        System.out.println("pastWeekInstant = " + pastWeekInstant);
        System.out.println("nextWeekInstant = " + nextWeekInstant);
        
    }
}