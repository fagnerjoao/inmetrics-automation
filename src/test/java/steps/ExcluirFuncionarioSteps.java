package steps;

import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.junit.jupiter.api.Test;
import pages.EmpregadosFormularioPage;
import pages.EmpregadosPage;
import tools.CapturarTela;

import java.awt.*;
import java.io.IOException;

public class ExcluirFuncionarioSteps {
    CapturarTela capturarTela = new CapturarTela();
    EmpregadosPage empregadosPage = new EmpregadosPage();
    EmpregadosFormularioPage empregadosFormularioPage = new EmpregadosFormularioPage();

    @Test

    @Quando("clico em EXCLUIR")
    public void clico_em_excluir() {
        empregadosPage.clickBtnExcluir();
    }

    @Então("valido que o funcionário removido com sucesso")
    public void valido_funcionário_removido_com_sucesso(String nome) throws IOException, AWTException {
        empregadosPage.isVisibleAlertSucessoExclusao();
        empregadosPage.setInputBusca(nome);
        empregadosPage.isNotVisibleRegistroTabela();
        capturarTela.capturaTela();
    }

}
