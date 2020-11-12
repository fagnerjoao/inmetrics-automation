package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import runner.Driver;


public class EmpregadosFormularioPage {

    public EmpregadosFormularioPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    GeradorCPF geradorCPF = new GeradorCPF();

    @FindBy(id = "inputNome")
    protected WebElement inputNome;

    @FindBy(id = "inputCargo")
    protected WebElement inputCargo;

    @FindBy(xpath = "//span[contains(.,'Sexo')]")
    protected WebElement spanCpf;

    @FindBy(id = "cpf")
    protected WebElement inputCpf;

    @FindBy(id = "dinheiro")
    protected WebElement inputSalario;

    @FindBy(id = "slctSexo")
    protected WebElement selectSexo;

    @FindBy(xpath = "//span[contains(.,'Sexo')]")
    protected WebElement spanSexo;

    @FindBy(id = "inputAdmissao")
    protected WebElement inputAdmissao;

    @FindBy(css = ".cadastrar-form-btn")
    protected WebElement btnCadastrar;


    public void setInputNome(String nome) {
        inputNome.sendKeys(nome);
    }

    public void setInputCargo(String cargo) {
        inputCargo.sendKeys(cargo);
    }

    public void setInputCpf(String cpf) {
        inputCpf.sendKeys(cpf);
    }

    public void setInputSalario(String salario) {
        inputSalario.sendKeys(salario);
    }

    public void setSelectSexo(String sexo) {
        selectSexo.click();
        selectSexo.findElement(By.xpath("//option[. = '" + sexo + "']")).click();
        spanSexo.click();
    }

    public void clickTipoContratacao(String tipoContrataca) {
        WebElement radioBtnTipoContrato = Driver.getDriver().findElement(By.id(tipoContrataca));
        radioBtnTipoContrato.click();
    }

    public void setInputAdmissao(String dataAdm) {
        inputAdmissao.sendKeys(dataAdm);
    }

    public void clickBtnCadastrar() {
        btnCadastrar.click();
    }


}
