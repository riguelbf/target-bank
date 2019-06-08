package stub;

public class ImpressaoStub {

    public static String telaOpcao() {

        return "************ Target Bank ************\n" +
                "Nome: Zezinho \n" +
                "Ag: 2603\n" +
                "Cc: 1647\n" +
                "*************************************\n" +
                "Opcoes\n" +
                "\n" +
                "1 - Extrato\n" +
                "2 - Saldo\n" +
                "3 - Deposito\n" +
                "4 - Saque\n" +
                "5 - Pagamentos\n" +
                "\n" +
                "*************************************";
    }

    public static String cabecalho() {
        return  "************ Target Bank ************\n";
    }

    public static String rodape() {
        return  "*************************************";
    }

    public static String dadosCliente() {
        return "Nome: Zezinho \n" +
                "Ag: 2603\n" +
                "Cc: 1647";
    }

    public static String telaLogin() {
        return
                "************ Target Bank ************\n" +
                "\n" +
                "Agencia: \n" +
                "Conta:\n" +
                "Senha:\n" +
                "\n" +
                "*************************************";
    }
}
