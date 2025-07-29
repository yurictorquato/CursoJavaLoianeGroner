package aula71;

public class MinhaThreadSoma implements Runnable {

    private String nome;
    private int[] numeros;
    private static Calculadora calculadora = new Calculadora();

    public MinhaThreadSoma(String nome, int[] numeros) {
        this.nome = nome;
        this.numeros = numeros;

        new Thread(this, nome).start();
        // Thread thread = new Thread(this, nome);
        // thread.start();
    }

    @Override
    public void run() {
        System.out.println(this.nome + " iniciada");

        int soma = calculadora.somaArray(this.numeros);

        System.out.println("Resultado da soma para thread %s é: %d".formatted(this.nome,
                soma));
        System.out.println(this.nome + " terminada");
    }
}
