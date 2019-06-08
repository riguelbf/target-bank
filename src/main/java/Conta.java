public class Conta {
    private long numero;
    private int agencia;

    public Conta(long numeContaCorrentista, int agenciaCorrentista) {
        this.numero = numeContaCorrentista;
        this.agencia = agenciaCorrentista;
    }

    public long getNumero() {
        return this.numero;
    }

    public int getAgencia() {
        return this.agencia;
    }
}
