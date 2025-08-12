package aula75_84;

import java.util.StringTokenizer;

public class Aula84 {

    public static void main(String[] args) {

        String doArquivo = "1;Yuri;25;";

        StringTokenizer stringTokenizer = new StringTokenizer(doArquivo, ";");

        while (stringTokenizer.hasMoreTokens()) {
            System.out.println(stringTokenizer.nextToken());
        }
    }
}
