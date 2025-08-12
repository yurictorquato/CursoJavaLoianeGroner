package aula75_84;

public class Aula82 {

    public static void main(String[] args) {

        String alfabeto = String.join(", ", "A", "B", "C", "D", "E", "F");
        System.out.println(alfabeto);

        String[] letras = alfabeto.split(", ");
        for (String letra : letras) {
            System.out.println(letra);
        }

        String doArquivo = "1;Yuri;25;";
        String[] informacoes = doArquivo.split(";");
        Pessoa pessoa = new Pessoa(Integer.parseInt(informacoes[0]),
                informacoes[1],
                Integer.parseInt(informacoes[2])
        );
        System.out.println(pessoa.toString());
    }
}
