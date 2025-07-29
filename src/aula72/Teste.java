package aula72;

public class Teste {

    public static void main(String[] args) {

        TiqueTaque tiqueTaque = new TiqueTaque();

        ThreadTiqueTaque tique = new ThreadTiqueTaque(tiqueTaque, "Tique");
        ThreadTiqueTaque taque = new ThreadTiqueTaque(tiqueTaque, "Taque");

        try {
            tique.thread.join();
            taque.thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
