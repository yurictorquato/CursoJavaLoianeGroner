package aula85_100;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Aula89 {

    public static void main(String[] args) {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy  HH:mm:ss");

        Calendar data = new GregorianCalendar(2010, 2, 11, 14, 55, 34);

        System.out.println(simpleDateFormat.format(data.getTime()));

        Date hoje = new Date();

        System.out.println(simpleDateFormat.format(hoje));

        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("dd/MM/yyyy");
        String minhaData = "11/04/2000";

        try {
            Date minhaDataEmDate = simpleDateFormat1.parse(minhaData);

            System.out.println(minhaDataEmDate);
            System.out.println(simpleDateFormat1.format(minhaDataEmDate));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
