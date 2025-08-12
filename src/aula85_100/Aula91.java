package aula85_100;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

public class Aula91 {

    public static void main(String[] args) {

        Date hoje = new Date();

        System.out.println(Locale.getDefault());

        String hojeFormatado = DateFormat.getInstance().format(hoje);
        System.out.println(hojeFormatado);

        Locale.setDefault(new Locale("en", "US"));

        hojeFormatado = DateFormat.getInstance().format(hoje);
        System.out.println(hojeFormatado);

        hojeFormatado = DateFormat.getTimeInstance().format(hoje);
        System.out.println(hojeFormatado);

        hojeFormatado = DateFormat.getDateInstance().format(hoje);
        System.out.println(hojeFormatado);

        hojeFormatado = DateFormat.getDateTimeInstance().format(hoje);
        System.out.println(hojeFormatado);

        hojeFormatado = DateFormat.getTimeInstance(DateFormat.SHORT).format(hoje);
        System.out.println(hojeFormatado);

        hojeFormatado = DateFormat.getTimeInstance(DateFormat.LONG).format(hoje);
        System.out.println(hojeFormatado);

        hojeFormatado =
                DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.SHORT).format(hoje);
        System.out.println(hojeFormatado);

//        String data = "01:08:2025 22:07";
//        try {
//            Date dataDate = DateFormat.getInstance().parse(data);
//            System.out.println(dataDate);
//        } catch (ParseException e) {
//            throw new RuntimeException(e);
//        }
    }
}
