package co.edu.udea.certificacion.monitoreoyreportes.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

import static co.edu.udea.certificacion.monitoreoyreportes.userinterfaces.UiDatosFlota.VD_NO_DATA;

public class ValidationNoDataFlota implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return VD_NO_DATA.resolveFor(actor).isVisible();
    }

    public static ValidationNoDataFlota noDataFlota(){
        return new ValidationNoDataFlota();
    }
}