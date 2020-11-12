package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import runner.Driver;

public class EmpregadosPage {

    public EmpregadosPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "#tabela_filter > label")
    protected WebElement lblBusca;

    @FindBy(css = "label > input")
    protected WebElement inputBusca;

    @FindBy(css = ".fa-pencil")
    protected WebElement btnEditar;

    @FindBy(css = ".fa-trash")
    protected WebElement btnExcluir;

    @FindBy(css = ".alert")
    protected WebElement alertSucesso;

    @FindBy(xpath = "//a[contains(text(),'Novo Funcionário')]")
    protected WebElement btnNovoFuncionario;

    @FindBy(css = ".odd:nth-child(1) > .sorting_1")
    protected WebElement tableFucncionario;

    @FindBy(css = ".dataTables_empty")
    protected WebElement tableFucncionariosVazia;


    public void clickBtnNovoFuncionario() throws InterruptedException {
        btnNovoFuncionario.click();
    }

    public void setInputBusca(String nome) {
        inputBusca.sendKeys(nome);
    }

    public void clickBtnEditar() {
        btnEditar.click();
    }

    public void clickBtnExcluir() {
        btnExcluir.click();
    }

    public boolean isVisibleAlertSucessoCadastro() {
        String msnSucesso = alertSucesso.getText();
        Assert.assertTrue(msnSucesso.contains("SUCESSO!"));
        return true;

    }

    public boolean isVisibleAlertSucessoEdicao() {
        String msnSucesso = alertSucesso.getText();
        Assert.assertTrue(msnSucesso.contains("SUCESSO!"));
        return true;
    }

    public boolean isVisibleAlertSucessoExclusao() {
        String msnSucesso = alertSucesso.getText();
        Assert.assertTrue(msnSucesso.contains("SUCESSO!"));
        return true;
    }

    public boolean isVisibleRegistroTabela(String nome) {
        String msn = tableFucncionario.getText();
        Assert.assertEquals(msn, nome);
        return true;
    }

    public boolean isNotVisibleRegistroTabela() {
        String msn = tableFucncionariosVazia.getText();
        Assert.assertEquals(msn, "Nenhum registro encontrado");
        return true;
    }

}
