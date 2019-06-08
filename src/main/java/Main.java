import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        CargaInicial.populaCorrentistas();

        ImpressaoConteudoTelaLogin telaLogin = new ImpressaoConteudoTelaLogin();
        Impressao impressao = new Impressao();
        String loginScreen = impressao.imprimirTela(telaLogin);
        System.out.println(loginScreen);

        Scanner scanner = new Scanner(System.in); // obter os dados

        int agencia = scanner.nextInt();
        long conta = scanner.nextLong();
        int senha = scanner.nextInt();

        Login login = new Login();

        boolean realizouLoginComSucesso = login.realizarLogin(agencia, conta, senha);

        if(realizouLoginComSucesso){
            ImpressaoConteudoInterface telaOpcao = new ImpressaoConteudoTelaOpcao();
            String telaOpcaoScreen = impressao.imprimirTela(telaOpcao);
            System.out.println(telaOpcaoScreen);

        }else {
            System.out.println("Usuario e/ou senha incorretos");
        }

    }
}
