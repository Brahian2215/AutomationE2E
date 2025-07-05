package co.edu.udea.certificacion.monitoreoyreportes.tasks;

import co.edu.udea.certificacion.monitoreoyreportes.userinterfaces.UiMonitoreoFlota;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class UpdateThe implements Task {

    @Override
    public <T extends Actor> void performAs(T t) {
        t.attemptsTo(Click.on(UiMonitoreoFlota.BUTTON_UPDATE));
    }

    public static UpdateThe infoMonitoreoFlota(){
        return Tasks.instrumented(UpdateThe.class);
    }
}
