package co.edu.udea.certificacion.monitoreoyreportes.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/monitoreo_flota.feature",
        glue = "co.edu.udea.certificacion.monitoreoyreportes.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class MonitoreoFlotaRunner {
}
