package aula85_100;

import java.util.Calendar;

public class Aula87 {

    public static void main(String[] args) {

        Calendar hoje = Calendar.getInstance(); // Singleton

        int ano = hoje.get(Calendar.YEAR);
        int mes = hoje.get(Calendar.MONTH);
        int dia = hoje.get(Calendar.DAY_OF_MONTH);
        int hora = hoje.get(Calendar.HOUR_OF_DAY);
        int minutos = hoje.get(Calendar.MINUTE);
        int segundos = hoje.get(Calendar.SECOND);

        // System.out.println(hoje);
        System.out.println("%02d/%02d/%d".formatted(dia, (mes + 1), ano));
        System.out.println("%02d:%02d:%02d".formatted(hora, minutos, segundos));

        hoje.add(Calendar.DAY_OF_MONTH, 10);

        System.out.println();

        System.out.println(hoje.get(Calendar.DAY_OF_MONTH));
    }
}
