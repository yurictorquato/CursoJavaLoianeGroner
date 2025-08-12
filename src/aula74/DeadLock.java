package aula74;

public class DeadLock {

    public static void main(String[] args) {

        final String RECURSO1 = "Recurso #1";
        final String RECURSO2 = "Recurso #2";

        Thread thread = new Thread() {
            public void run() {
                synchronized (RECURSO1) {
                    System.out.println("Thread #1: bloqueou o recurso 1");

                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    System.out.println("Thread #1: tentando o acesso ao recurso 2");

                    synchronized (RECURSO2) {
                        System.out.println("Thread #1: bloqueou o recurso 2");
                    }
                }
            }
        };

        Thread outraThread = new Thread() {
            public void run() {
                synchronized (RECURSO2) {
                    System.out.println("Thread #2: bloqueou o recurso 2");

                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    System.out.println("Thread #2: tentando o acesso ao recurso 1");

                    synchronized (RECURSO1) {
                        System.out.println("Thread #2: bloqueou o recurso 1");
                    }
                }
            }
        };

        thread.start();
        outraThread.start();
    }
}
