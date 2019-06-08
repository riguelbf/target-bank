public class ImpressaoConteudoTelaLogin implements ImpressaoConteudoInterface {
    @Override
    public String imprimir() {
        return "\n" +
                "Agencia: \n" +
                "Conta:\n" +
                "Senha:\n" +
                "\n";
    }
}
