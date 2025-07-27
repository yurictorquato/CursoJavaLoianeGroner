package aula69;

public class MinhaThreadRunnable implements Runnable {

    // Atributes
    private String nome;
    private int tempo;

    // Constructor
    public MinhaThreadRunnable(String nome, int tempo) {
        this.nome = nome;
        this.tempo = tempo;

        // Thread thread = new Thread();
        // thread.start();
    }

    // Methods

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("%s: contador %d".formatted(nome, i));
            try {
                Thread.sleep(tempo);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("%s terminou a execução".formatted(nome));
    }
}
