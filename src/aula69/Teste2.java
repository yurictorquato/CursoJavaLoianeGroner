package aula69;

public class Teste2 {

    public static void main(String[] args) {

        MinhaThreadRunnable minhaThreadRunnable = new MinhaThreadRunnable("Thread #1", 500);
        MinhaThreadRunnable minhaThreadRunnable1 = new MinhaThreadRunnable("Thread #2", 500);
        MinhaThreadRunnable minhaThreadRunnable2 = new MinhaThreadRunnable("Thread #3", 500);

        Thread thread = new Thread(minhaThreadRunnable);
        Thread thread1 = new Thread(minhaThreadRunnable1);
        Thread thread2 = new Thread(minhaThreadRunnable2);

        thread.start();
        thread1.start();
        thread2.start();

        while (thread.isAlive() || thread1.isAlive() || thread2.isAlive()) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("Programa finalizado");
    }
}
