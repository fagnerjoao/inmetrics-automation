package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import runner.Driver;

public class GeradorCPF {

    public GeradorCPF() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "txtCPF")
    protected WebElement intputCpfCnpj;

    @FindBy(id = "btnGerarCPF")
    protected WebElement btnGerarCPF;

    @FindBy(id = "btnGerarCNPJ")
    protected WebElement btnGerarCNPJ;
}
