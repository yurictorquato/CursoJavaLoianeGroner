package aula85_100;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Aula94 {

    public static void main(String[] args) {

        try {
            differenceDateUntilJava7();
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    public static void differenceDateUntilJava7() throws ParseException {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));

        Date firstDate = simpleDateFormat.parse("01/01/2025");
        Date secondDate = simpleDateFormat.parse("01/02/2025");

        long differenceInMilliSeconds = Math.abs(secondDate.getTime() - firstDate.getTime());

        long difference = differenceInMilliSeconds / (1000 * 60 * 60 * 24);

        System.out.println(difference);
    }

}
