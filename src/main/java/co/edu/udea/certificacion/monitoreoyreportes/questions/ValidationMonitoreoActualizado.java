package co.edu.udea.certificacion.monitoreoyreportes.questions;

import co.edu.udea.certificacion.monitoreoyreportes.userinterfaces.UiMonitoreoFlota;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidationMonitoreoActualizado implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return UiMonitoreoFlota.VD_DATA_MONITOREO.resolveFor(actor).isVisible();
    }

    public static ValidationMonitoreoActualizado dataMonitoreo(){
        return  new ValidationMonitoreoActualizado();
    }
}
