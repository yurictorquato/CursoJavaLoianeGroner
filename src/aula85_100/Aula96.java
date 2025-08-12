package aula85_100;

import java.math.RoundingMode;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Currency;
import java.util.Locale;

public class Aula96 {

    public static void main(String[] args) throws ParseException {

        System.out.println("---------------------------------------");

        Locale english = new Locale("en", "United States");

        NumberFormat numberFormat = NumberFormat.getNumberInstance(english);

        String number = numberFormat.format(100.99);
        System.out.println(number);

        Locale portuguese = new Locale("pt", "Brazil");

        NumberFormat numberFormat1 = NumberFormat.getNumberInstance(portuguese);

        String number1 = numberFormat1.format(100.99);
        System.out.println(number1);

        // Coin
        System.out.println("---------------------------------------");

        NumberFormat coin = NumberFormat.getCurrencyInstance(Locale.getDefault());

        String value = coin.format(100.99);
        System.out.println(value);

        Currency currency = coin.getCurrency();
        System.out.println(currency);

        // Percentage
        System.out.println("---------------------------------------");

        NumberFormat percent = NumberFormat.getPercentInstance();

        String percentage = percent.format(99.887);
        System.out.println(percentage);

        percent.setMaximumIntegerDigits(4);
        percent.setMinimumIntegerDigits(3);

        percent.setMaximumFractionDigits(2);
        percent.setMinimumFractionDigits(1);

        String percentage1 = percent.format(99.887);
        System.out.println(percentage1);

        // Around
        System.out.println("---------------------------------------");

        numberFormat = NumberFormat.getInstance();

        numberFormat.setRoundingMode(RoundingMode.DOWN);
        numberFormat.setMaximumFractionDigits(0);
        numberFormat.setMinimumFractionDigits(0);
        System.out.println(numberFormat.format(56.50));

        Number number2 = numberFormat.parse("100,89");
        System.out.println(number2.intValue());
    }
}
