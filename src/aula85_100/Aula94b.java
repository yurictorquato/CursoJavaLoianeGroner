package aula85_100;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Aula94b {

    public static void main(String[] args) {

        differenceDateJava8();

        System.out.println("----------------------------------");

        differenceDateJava8WithTime();

        System.out.println("----------------------------------");

        differenceDateJava8WithChronoUnit();
    }

    public static void differenceDateJava8() {

        LocalDate date1 = LocalDate.of(2025, 1, 1);
        LocalDate date2 = LocalDate.of(2025, 2, 1);

        Period period = Period.between(date1, date2);

        int days = period.getDays();
        int months = period.getMonths();
        int years = period.getYears();

        System.out.println("Days: " + days);
        System.out.println("Months: " + months);
        System.out.println("Years: %d".formatted(years));
    }

    public static void differenceDateJava8WithTime() {

        LocalDateTime date1 = LocalDateTime.of(2019, 1, 1, 6, 30);
        LocalDateTime date2 = LocalDateTime.of(2019, 1, 1, 9, 30);

        Duration duration = Duration.between(date1, date2);

        long difference = duration.toHours();

        System.out.println(difference);
    }

    public static void differenceDateJava8WithChronoUnit() {

        LocalDateTime date1 = LocalDateTime.of(2019, 1, 1, 6, 30);
        LocalDateTime date2 = LocalDateTime.of(2019, 1, 1, 9, 30);

        long difference = ChronoUnit.HOURS.between(date1, date2);

        System.out.println(difference);
    }
}
