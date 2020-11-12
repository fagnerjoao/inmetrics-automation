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

public class CatdastrarFuncionarioSteps {
    CapturarTela capturarTela = new CapturarTela();
    EmpregadosPage empregadosPage = new EmpregadosPage();
    EmpregadosFormularioPage empregadosFormularioPage = new EmpregadosFormularioPage();

    @Test

    @Quando("clico em NOVO FUNCIONÁRIO")
    public void clico_em_novo_funcionário() throws Throwable {
        empregadosPage.clickBtnNovoFuncionario();
    }

    @E("envio o formulário preeenchido com os dados  {string} {string} {string} {string} {string} {string} {string} do funcionário")
    public void envioOFormulárioPreeenchidoComOsDadosDoFuncionário(String nome, String cargo, String cpf, String salario, String sexo, String tipoContratacao, String dataAdm) throws Throwable {
        empregadosFormularioPage.setInputNome(nome);
        empregadosFormularioPage.setInputCargo(cargo);
        empregadosFormularioPage.setInputCpf(cpf);
        empregadosFormularioPage.setInputSalario(salario);
        empregadosFormularioPage.setSelectSexo(sexo);
        //Thread.sleep(3000);
        empregadosFormularioPage.clickTipoContratacao(tipoContratacao);
        empregadosFormularioPage.setInputAdmissao(dataAdm);
        capturarTela.capturaTela();
        empregadosFormularioPage.clickBtnCadastrar();
    }

    @Então("visualizo a mensagem de funcinário cadastrado com sucesso")
    public void visualizo_a_mensagem_de_funcinário_cadastrado_com_sucesso() throws IOException, AWTException {
        empregadosPage.isVisibleAlertSucessoCadastro();
        capturarTela.capturaTela();

    }
}
