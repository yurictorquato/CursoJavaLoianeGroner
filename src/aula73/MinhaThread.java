package aula73;

public class MinhaThread implements Runnable {

    private String nome;
    private boolean estaSuspensa;

    public MinhaThread(String nome) {
        this.nome = nome;
        this.estaSuspensa = false;

        new Thread(this, nome).start();
//        Thread thread = new Thread(this, nome);
//        thread.start();
    }

    @Override
    public void run() {
        System.out.println("Executando " + this.nome);

        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Thread " + nome + " -> " + i);

                Thread.sleep(300);

                synchronized (this) {
                    while (estaSuspensa) {
                        wait();
                    }
                }
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Thread " + this.nome + " terminada");
    }
}
