package aula75_84;

public class Aula83 {

    public static void main(String[] args) {

        String[] letras = {"B", "C", "D", "E", "F"};

        String alfabeto = "";

        for (String letra : letras) {
            alfabeto += letra;
        }

        System.out.println(alfabeto);

        StringBuffer stringBuffer = new StringBuffer(); // Thread safer
        for (String letra : letras) {
            stringBuffer.append(letra);
        }

        alfabeto = stringBuffer.toString();

        System.out.println(alfabeto);

        alfabeto = new String(stringBuffer);

        System.out.println(alfabeto);
        System.out.println(stringBuffer.reverse());

        StringBuilder stringBuilder = new StringBuilder();
        for (String letra : letras) {
            stringBuilder.append(letra);
        }

        alfabeto = stringBuilder.toString();

        System.out.println(alfabeto);
    }
}
