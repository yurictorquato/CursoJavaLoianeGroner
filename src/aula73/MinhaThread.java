package aula73;

public class MinhaThread implements Runnable {

    private String nome;
    private boolean estaSuspensa;
    private boolean foiTerminada;

    public MinhaThread(String nome) {
        this.nome = nome;
        this.estaSuspensa = false;

        new Thread(this, nome).start();
//        Thread thread = new Thread(this, nome);
//        thread.start();
    }

    public String getNome() {
        return nome;
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

                    if (foiTerminada) {
                        break;
                    }
                }
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Thread " + this.nome + " terminada");
    }

    synchronized void suspend() {
        estaSuspensa = true;
    }

    synchronized void resume() {
        estaSuspensa = false;
        notify();
    }

    synchronized void stop() {
        foiTerminada = true;
        notify();
    }
}
