package co.edu.udea.certificacion.monitoreoyreportes.tasks;

import co.edu.udea.certificacion.monitoreoyreportes.interactions.SeeDataFlota;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class FindThe implements Task {

    private final String nombreFlota;

    public FindThe(String nombreFlota) {
        this.nombreFlota = nombreFlota;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(SeeDataFlota.withName(nombreFlota));
    }

    public static FindThe infoFlotaPage(String nombreFlota){
        return Tasks.instrumented(FindThe.class, nombreFlota);
    }
}