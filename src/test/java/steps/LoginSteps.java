package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.junit.jupiter.api.Test;
import pages.EmpregadosPage;
import pages.LoginPage;
import tools.CapturarTela;

import java.awt.*;
import java.io.IOException;

public class LoginSteps {
    CapturarTela capturarTela = new CapturarTela();
    LoginPage loginPage = new LoginPage();
    EmpregadosPage empregadosPage = new EmpregadosPage();

    String usuario = "inMetricsRH";
    String senha = "senha1234";

    @Test

    @Dado("que eu esteja na pagina de login")
    public void que_eu_esteja_na_pagina_de_login() throws IOException, AWTException, InterruptedException {
        loginPage.isVisibleLoginPage();
        capturarTela.capturaTela();
    }

    @Quando("efeutuo o login")
    public void efeutuo_o_login() throws IOException, AWTException, InterruptedException {

        loginPage.setInputUsuario(usuario);
        loginPage.setInputSenha(senha);
        loginPage.clickBtnEntre();
        capturarTela.capturaTela();
    }

    @Então("visualizo a pagina empregados")
    public void visualizo_a_pagina_empregados() throws IOException, AWTException, InterruptedException {
        empregadosPage.clickBtnNovoFuncionario();
        capturarTela.capturaTela();
    }

    @Dado("que eu esteja lgoado no sitema")
    public void que_eu_esteja_lgoado_no_sitema() throws IOException, AWTException, InterruptedException {
        loginPage.isVisibleLoginPage();
        capturarTela.capturaTela();

        loginPage.setInputUsuario(usuario);
        loginPage.setInputSenha(senha);
        loginPage.clickBtnEntre();
        capturarTela.capturaTela();
    }

}
