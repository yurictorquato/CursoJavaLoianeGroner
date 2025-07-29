package aula72;

public class TiqueTaque {

    boolean tique;

    public synchronized void tique(boolean estaExecutando) {
        if (!estaExecutando) {
            tique = true;

            notify();

            return;
        }

        System.out.println("Tique");

        tique = true;

        notify();

        try {
            while (tique) {
                wait();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public synchronized void taque(boolean estaExecutando) {
        if (!estaExecutando) {
            tique = false;

            notify();

            return;
        }

        System.out.println("Taque");

        tique = false;

        notify();

        try {
            while (!tique) {
                wait();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
