package aula70;

public class Teste {

    public static void main(String[] args) {

        MinhaThreadRunnable minhaThreadRunnable = new MinhaThreadRunnable("#1", 500);
        MinhaThreadRunnable minhaThreadRunnable1 = new MinhaThreadRunnable("#2", 500);
        MinhaThreadRunnable minhaThreadRunnable2 = new MinhaThreadRunnable("#3", 500);

        Thread thread = new Thread(minhaThreadRunnable);
        Thread thread1 = new Thread(minhaThreadRunnable1);
        Thread thread2 = new Thread(minhaThreadRunnable2);

        thread.setPriority(10);
        thread1.setPriority(1);
        thread2.setPriority(5);

//        thread.setPriority(Thread.MAX_PRIORITY);
//        thread.setPriority(Thread.MIN_PRIORITY);
//        thread.setPriority(Thread.NORM_PRIORITY);

        thread.start();
        thread1.start();
        thread2.start();
    }
}
