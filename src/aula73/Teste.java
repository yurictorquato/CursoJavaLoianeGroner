package aula73;

public class Teste {

    public static void main(String[] args) {

        MinhaThread thread1 = new MinhaThread("#1");
        MinhaThread thread2 = new MinhaThread("#2");

        System.out.println("Suspendendo a Thread %s".formatted(thread1.getNome()));

        thread1.suspend();

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Suspendendo a Thread %s".formatted(thread2.getNome()));

        thread2.suspend();

        System.out.println("Resumindo a Thread %s".formatted(thread1.getNome()));

        thread1.resume();

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Resumindo a Thread %s".formatted(thread2.getNome()));

        thread2.resume();

        System.out.println("Terminando a Thread %s".formatted(thread2.getNome()));

        thread2.stop();
    }
}
