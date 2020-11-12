package steps;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.junit.jupiter.api.Test;
import pages.EmpregadosFormularioPage;
import pages.EmpregadosPage;
import tools.CapturarTela;

import java.awt.*;
import java.io.IOException;

public class EditarFuncionarioSteps {
    CapturarTela capturarTela = new CapturarTela();
    EmpregadosPage empregadosPage = new EmpregadosPage();
    EmpregadosFormularioPage empregadosFormularioPage = new EmpregadosFormularioPage();

    @Test

    @Quando("faço a busca pelo funcionário {string}")
    public void faço_a_busca_pelo_funcionário(String nome) throws IOException, AWTException {
        empregadosPage.setInputBusca(nome);
        empregadosPage.isVisibleRegistroTabela(nome);
        capturarTela.capturaTela();
    }

    @E("clico em EDITAR")
    public void clico_em_editar() {
        empregadosPage.clickBtnEditar();
    }

    @E("envio o formulário com os dados {string} {string} {string} do funcionário editados")
    public void envioOFormulárioComOsDadosDoFuncionárioEditados(String cargo, String salario, String tipoContrataca) throws IOException, AWTException {
        empregadosFormularioPage.setInputCargo(cargo);
        empregadosFormularioPage.setInputSalario(salario);
        empregadosFormularioPage.clickTipoContratacao(tipoContrataca);
        capturarTela.capturaTela();
        empregadosFormularioPage.clickBtnCadastrar();
    }

    @Então("visualizo a mensagem de funcinário editado com sucesso")
    public void visualizo_a_mensagem_de_funcinário_editado_com_sucesso() throws IOException, AWTException {
        empregadosPage.isVisibleAlertSucessoEdicao();
        capturarTela.capturaTela();
    }
}
