package aula75_84;

public class Aula76 {

    public static void main(String[] args) {

        String curso = "Curso ";
        String java = "Java";

        String cursoJava = curso + java;

        System.out.println(cursoJava);

        String resultado2Com2 = "Resultado de 2 + 2 = " + (2 + 2);
        System.out.println(resultado2Com2);

        String resultado2Com2_ = "Resultado de 2 + 2 = " + 2 + 2;
        System.out.println(resultado2Com2_);

        String um = String.valueOf(1);
        System.out.println(um);

        String concatenacao = "Passei toda a vida subindo os degraus de uma escada feita de " +
                "responsabilidade. " + "Quando eu era pequena, minha única obrigação era " +
                "estudar muito e obedecer aos meus pais. " + "Mais tarde, no ensino médio e " +
                "na faculdade, a responsabilidade de estudar muito continuou, acrescida à " +
                "obrigação de me tornar uma pessoa útil, não um fardo para a sociedade.";
        System.out.println(concatenacao);

        System.out.println();

        String concatenacao2 = "Trecho do livro 'O Fim da Morte': ";
        concatenacao2 += concatenacao;
        System.out.println(concatenacao2);
    }
}
