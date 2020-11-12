package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import runner.Driver;

public class CadastroUsuarioPage {

    public CadastroUsuarioPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "confirmpass")
    protected WebElement inputConfirmSenha;



    public void setInputConfirmSenha(String senha) {
        inputConfirmSenha.click();
        inputConfirmSenha.sendKeys(senha);
    }

}
