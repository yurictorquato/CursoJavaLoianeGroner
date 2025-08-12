package aula85_100;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Aula93 {

    public static void main(String[] args) {

        // data dd/MM/yyyy
        LocalDate agora = LocalDate.now();

        System.out.println(agora);

        System.out.println(LocalDate.of(2000, 04, 11));
        System.out.println(LocalDate.parse("2007-08-26"));

        System.out.println(agora.plusDays(25));
        System.out.println(agora.minusDays(50));
        System.out.println(agora.minus(1, ChronoUnit.MONTHS));

        System.out.println(agora.getDayOfWeek());
        System.out.println(agora.getDayOfMonth());
        System.out.println(agora.getDayOfYear());
    }
}
