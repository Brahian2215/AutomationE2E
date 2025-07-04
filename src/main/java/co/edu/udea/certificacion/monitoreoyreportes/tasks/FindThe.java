package co.edu.udea.certificacion.monitoreoyreportes.tasks;

import co.edu.udea.certificacion.monitoreoyreportes.interactions.SeeDataFlota;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class FindThe implements Task {

    @Override
    public <T extends Actor> void performAs(T t) {
        t.attemptsTo(SeeDataFlota.dataFlota());
    }

    public static FindThe infoFlotaPage(){
        return Tasks.instrumented(FindThe.class);
    }
}