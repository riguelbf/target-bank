import org.junit.Assert;
import org.junit.Test;
import stub.ImpressaoStub;

public class ImpressaoTest {

    @Test
    public void deve_imprimir_tela_opcoes(){

        // Cenario
        Impressao impressao = new Impressao();

        // Acao
        String telaOpcao = impressao.telaOpcao();


        // Validação
        Assert.assertEquals(telaOpcao, ImpressaoStub.telaOpcao());
    }
}
