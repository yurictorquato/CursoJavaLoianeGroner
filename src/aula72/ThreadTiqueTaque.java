package aula72;

public class ThreadTiqueTaque implements Runnable {

    TiqueTaque tiqueTaque;
    Thread thread;

    final int numero = 5;

    public ThreadTiqueTaque(TiqueTaque tiqueTaque, String nome) {
        this.tiqueTaque = tiqueTaque;

        thread = new Thread(this, nome);
        thread.start();
    }

    @Override
    public void run() {
        if (thread.getName().equalsIgnoreCase("Tique")) {
            for (int i = 0; i < numero; i++) {
                tiqueTaque.tique(true);
            }

            tiqueTaque.tique(false);
        } else {
            for (int i = 0; i < numero; i++) {
                tiqueTaque.taque(true);
            }

            tiqueTaque.taque(false);
        }
    }
}
