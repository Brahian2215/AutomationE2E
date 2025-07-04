package co.edu.udea.certificacion.monitoreoyreportes.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.edu.udea.certificacion.monitoreoyreportes.userinterfaces.UiDatosFlota.VD_DATA_FLOTA;

public class ValidationSeeDataFlota implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        String stringTemp = Text.of(VD_DATA_FLOTA).toString();
        if (stringTemp.contains("Cootranscol")) {
            return true;
        } else return false;
    }

    public static ValidationSeeDataFlota dataFlota(){
        return new ValidationSeeDataFlota();
    }

}