package aula74;

public class ThreadSemaforo implements Runnable {

    // Atributes
    private CorSemaforo cor;
    private boolean parar;
    private boolean corMudou;

    // Constructor
    public ThreadSemaforo() {
        this.cor = CorSemaforo.VERMELHO;
        // this.parar = false; // por padrão boolean tem valor inicial "false"
        // this.corMudou = false; // por padrão boolean tem valor inicial "false"

        new Thread(this).start();
    }

    // Methods
    public CorSemaforo getCor() {
        return cor;
    }

    @Override
    public void run() {
        while (!this.parar) {
            try {
//                switch (cor) {
//                    case VERMELHO -> Thread.sleep(1000);
//                    case AMARELO -> Thread.sleep(500);
//                    case VERDE -> Thread.sleep(2000);
//                }
                Thread.sleep(this.cor.getTempoEspera());

                mudarCor();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private synchronized void mudarCor() {
        switch (this.cor) {
            case VERDE -> cor = CorSemaforo.AMARELO;
            case AMARELO -> cor = CorSemaforo.VERMELHO;
            case VERMELHO -> cor = CorSemaforo.VERDE;
        }

        this.corMudou = true;

        notify();
    }

    public synchronized void esperaCorMudar() {
        while (!this.corMudou) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        this.corMudou = false;
    }

    public synchronized void desligarSemaforo() {
        this.parar = true;
    }
}
