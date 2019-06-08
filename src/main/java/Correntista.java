public class Correntista {

    private Conta conta;
    private int senha;

    public Correntista(Conta conta, int senha) {
        this.conta = conta;
        this.senha = senha;
    }

    public Conta getConta() {
        return this.conta;
    }

    public int getSenha() {
        return this.senha;
    }
}
