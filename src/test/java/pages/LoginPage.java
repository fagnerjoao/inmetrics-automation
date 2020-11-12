package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import runner.Driver;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = ".login100-form-title")
    protected WebElement titleLogin;

    @FindBy(xpath = "//a[contains(text(),'Cadastre-se')]")
    protected WebElement btnCadastreSe;

    @FindBy(name = "username")
    protected WebElement inputUsuario;

    @FindBy(name = "pass")
    protected WebElement inputSenha;

    @FindBy(css = ".login100-form-btn")
    protected WebElement btnEntre;

    public void setInputUsuario(String usuario) {
        inputUsuario.sendKeys(usuario);
    }

    public void setInputSenha(String senha) {
        inputSenha.sendKeys(senha);
    }

    public void clickBtnEntre() throws InterruptedException {
        Thread.sleep(3000);
        btnEntre.click();
    }

    public void clickBtnCadastreSe() {
        btnCadastreSe.click();
    }

    public boolean isVisibleLoginPage() {
        String msnSucesso = titleLogin.getText();
        Assert.assertEquals(msnSucesso, "Login");
        return true;
    }
}
