package steps;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.junit.jupiter.api.Test;
import pages.CadastroUsuarioPage;
import pages.EmpregadosPage;
import pages.LoginPage;
import tools.CapturarTela;

import java.awt.*;
import java.io.IOException;

public class CadastrarUsuarioSteps {
    CapturarTela capturarTela = new CapturarTela();
    LoginPage loginPage = new LoginPage();
    CadastroUsuarioPage cadastroUsuarioPage = new CadastroUsuarioPage();

    @Test

    @Quando("clico CADASTRE-SE")
    public void clico_cadastre_se() {
        loginPage.clickBtnCadastreSe();
    }

    @E("informo as credênciais de acesso")
    public void informo_as_credênciais_de_acesso() throws IOException, AWTException {
        String usuario = "inMetricsRH";
        String senha = "senha1234";
        loginPage.setInputUsuario(usuario);
        loginPage.setInputSenha(senha);
        cadastroUsuarioPage.setInputConfirmSenha(senha);
        capturarTela.capturaTela();
    }

    @E("clico em CADASTRAR")
    public void clico_em_cadastrar() throws InterruptedException {
        loginPage.clickBtnEntre();
    }

    @Então("visusalizo a tela de login")
    public void visusalizo_a_tela_de_login() throws IOException, AWTException, InterruptedException {
        loginPage.isVisibleLoginPage();
        capturarTela.capturaTela();
    }
}
