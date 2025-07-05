package co.edu.udea.certificacion.monitoreoyreportes.questions;

import co.edu.udea.certificacion.monitoreoyreportes.userinterfaces.UiMonitoreoFlota;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidationNoDataMonitoreo implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return UiMonitoreoFlota.VD_NO_UPDATE.resolveFor(actor).isVisible();
    }

    public static ValidationNoDataMonitoreo noDataMonitoreo() {
        return new ValidationNoDataMonitoreo();
    }
}