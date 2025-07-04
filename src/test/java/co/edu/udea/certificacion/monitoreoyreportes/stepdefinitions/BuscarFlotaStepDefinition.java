package co.edu.udea.certificacion.monitoreoyreportes.stepdefinitions;

import co.edu.udea.certificacion.monitoreoyreportes.questions.ValidationSeeDataFlota;
import co.edu.udea.certificacion.monitoreoyreportes.tasks.FindThe;
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

public class BuscarFlotaStepDefinition {

    @Managed(driver="chrome")
    public WebDriver driver;

    private Actor usuario = Actor.named("usuario");

    @Before
    public void config(){
        OnStage.setTheStage(new OnlineCast());
        //OnStage.theActorCalled("user");
        usuario.can(BrowseTheWeb.with(driver));
    }

    //@Given("This method is responsible for parameterizing the instantiation of chromedriver")    public void thisMethodIsResponsibleForParameterizingTheInstantiationOfChromedriver() {         OnStage.theActorInTheSpotlight().wasAbleTo(Open.browserOn().thePageNamed("pages.swaglabsUrl"));    }

    @Given("que el usuario accede a la aplicacion en la GUI de Informacion de Flotas")
    public void informacionFlotaGui(){
        usuario.can(BrowseTheWeb.with(driver));
    }

    @When("busca una flota con el nombre Cootranscol")
    public void buscarFlotaPorNombre(){
        usuario.attemptsTo(FindThe.infoFlotaPage());
    }

    @Then("deberia ver la información de dicha flota en la tabla")
    public void muestraInformacionFlota(){
        usuario.should(seeThat(ValidationSeeDataFlota.dataFlota(),equalTo(true)));
    }

}
