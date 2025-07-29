package aula69;

public class Teste3 {

    public static void main(String[] args) {

        MinhaThreadRunnable minhaThreadRunnable = new MinhaThreadRunnable("Thread #1", 300);
        MinhaThreadRunnable minhaThreadRunnable1 = new MinhaThreadRunnable("Thread #2", 500);
        MinhaThreadRunnable minhaThreadRunnable2 = new MinhaThreadRunnable("Thread #3", 780);

        Thread thread = new Thread(minhaThreadRunnable);
        Thread thread1 = new Thread(minhaThreadRunnable1);
        Thread thread2 = new Thread(minhaThreadRunnable2);

        thread.start();

//        try {
//            thread.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        thread1.start();

//        try {
//            thread1.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        thread2.start();

        try {
            thread.join();
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Programa finalizado");
    }
}
