package co.edu.udea.certificacion.monitoreoyreportes.stepdefinitions;

import co.edu.udea.certificacion.monitoreoyreportes.questions.ValidationMonitoreoActualizado;
import co.edu.udea.certificacion.monitoreoyreportes.questions.ValidationNoDataMonitoreo;
import co.edu.udea.certificacion.monitoreoyreportes.tasks.UpdateThe;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class MonitoreoFlotaStepDefinition {

    @Managed(driver = "chrome")
    public WebDriver driver;

    private Actor admin = Actor.named("Administrador");

    @Before
    public void config() {
        OnStage.setTheStage(new OnlineCast());
        admin.can(BrowseTheWeb.with(driver));
    }

    @Given("que el administrador accede a la aplicacion en la GUI de Indicadores de Monitoreo de Flotas")
    public void monitoreoFlotaGui() {
        admin.wasAbleTo(Open.url("https://p1-f5-fleet-guard360-feature5.vercel.app/hu03"));
    }

    @When("actualiza los indicadores de monitoreo de una flota")
    public void actualizaMonitoreoFlota() {
        admin.attemptsTo(UpdateThe.infoMonitoreoFlota());
    }

    @Then("deberia ver la informacion de monitoreo de flotas actualizada en tiempo real")
    public void muestraMonitoreoActualizado() {
        admin.should(seeThat(ValidationMonitoreoActualizado.dataMonitoreo(), equalTo(true)));
    }

    @Then("deberia ver un mensaje indicando que la informacion no pudo ser actualizada")
    public void mensajeFalloActualizacion() {
        admin.should(seeThat(ValidationNoDataMonitoreo.noDataMonitoreo(), equalTo(true)));
    }

}
