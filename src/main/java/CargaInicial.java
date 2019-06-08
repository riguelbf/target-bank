public class CargaInicial {
    public static void populaCorrentistas() {
        Conta conta = new Conta(123456,456);
        int senha = 987654;
        Correntista correntista = new Correntista(conta, senha, "Zezinho");
        BancoDeDados.getCorrentistas().add(correntista);
    }
}
