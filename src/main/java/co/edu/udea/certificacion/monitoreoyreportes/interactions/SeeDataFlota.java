package co.edu.udea.certificacion.monitoreoyreportes.interactions;

import co.edu.udea.certificacion.monitoreoyreportes.userinterfaces.UiDatosFlota;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static co.edu.udea.certificacion.monitoreoyreportes.userinterfaces.UiDatosFlota.BUTTON_FIND;
import static co.edu.udea.certificacion.monitoreoyreportes.userinterfaces.UiDatosFlota.INPUT_TEXT;

public class SeeDataFlota implements Interaction {

    private final String nombreFlota;

    public SeeDataFlota(String nombreFlota) {
        this.nombreFlota = nombreFlota;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(nombreFlota).into(INPUT_TEXT).thenHit(Keys.RETURN),
                Click.on(BUTTON_FIND)
        );
    }

    public static SeeDataFlota withName(String nombreFlota) {
        return Tasks.instrumented(SeeDataFlota.class, nombreFlota);
    }
}