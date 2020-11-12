package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",
        glue = {""},
        monochrome = true,
        dryRun = false,
        tags = "@excluirFuncionario")

public class Runner {

}