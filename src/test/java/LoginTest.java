import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class LoginTest {

    // carga inicial
    @Before
    public void configurarTestes(){
        CargaInicial.populaCorrentistas();
    }

    @Test
    public void deve_realizar_login(){

        // Cenario
        long numeContaCorrentista = 123456;
        int agenciaCorrentista = 456;
        int senhaCorrentista = 987654;

        Correntista correntista =
                new Correntista(new Conta(numeContaCorrentista, agenciaCorrentista)
                        , senhaCorrentista, "Zezinho");

        Conta conta = correntista.getConta();
        long numeroConta = conta.getNumero();
        int agencia = conta.getAgencia();
        int senha = correntista.getSenha();
        Login login = new Login();

        // Acao
        boolean loginSucesso = login.realizarLogin(agencia, numeroConta, senha);

        // Validacao
        assertTrue(loginSucesso);
    }


}
