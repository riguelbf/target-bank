public class Conta {
    private long numero;
    private int agencia;

    public Conta(long numeroContaCorrentista, int agenciaCorrentista) {
        this.numero = numeroContaCorrentista;
        this.agencia = agenciaCorrentista;
    }

    public long getNumero() {
        return this.numero;
    }

    public int getAgencia() {
        return this.agencia;
    }
}
