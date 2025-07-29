package aula71;

public class Teste {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};
        MinhaThreadSoma threadSoma1 = new MinhaThreadSoma("#1", array);
        MinhaThreadSoma threadSoma2 = new MinhaThreadSoma("#2", array);
    }
}
