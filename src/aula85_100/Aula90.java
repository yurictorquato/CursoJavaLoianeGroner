package aula85_100;

import java.util.Locale;

public class Aula90 {

    public static void main(String[] args) {

        Locale locale = Locale.getDefault();

        System.out.println(locale);

        Locale[] locales = Locale.getAvailableLocales();

        // System.out.println(Arrays.toString(locales));
        for (Locale availableLocale : locales) {
            System.out.println("Nome: " + availableLocale.getDisplayName());
            System.out.println("Código da língua: " + availableLocale.getLanguage());
            System.out.println("Língua: %s".formatted(availableLocale.getDisplayLanguage()));
            System.out.println("Código do país: " + availableLocale.getCountry());
            System.out.println("Nome do país: " + availableLocale.getDisplayCountry());

            System.out.println();
        }

        Locale us = new Locale("en", "United States");

        System.out.println(us);

        // Locale.setDefault(us);

        // System.out.println(Locale.getDefault());
    }
}
