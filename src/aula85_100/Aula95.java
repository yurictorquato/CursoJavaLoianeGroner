package aula85_100;

import java.util.Locale;
import java.util.ResourceBundle;

public class Aula95 {

    public static void main(String[] args) {

        System.out.println("Actual locale: " + Locale.getDefault());

        ResourceBundle resourceBundle = ResourceBundle.getBundle("meu-texto");

        System.out.println("Olá: " + resourceBundle.getString("hello"));
        System.out.println("Mundo: " + resourceBundle.getString("world"));

        // Locale.setDefault(new Locale("en_US", "en_US"));

        resourceBundle = ResourceBundle.getBundle("meu-texto", new Locale("en_US", "en_US"));

        System.out.println("Hello: " + resourceBundle.getString("hello"));
        System.out.println("World: " + resourceBundle.getString("world"));
    }
}
