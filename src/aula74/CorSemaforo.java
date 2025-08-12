package aula74;

public enum CorSemaforo {

    VERDE(2000), AMARELO(500), VERMELHO(1000);

    private int tempoEspera;

    CorSemaforo(int tempoEspera) {
        this.tempoEspera = tempoEspera;
    }

    public int getTempoEspera() {
        return tempoEspera;
    }
}
