package co.edu.udea.certificacion.monitoreoyreportes.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

import static co.edu.udea.certificacion.monitoreoyreportes.userinterfaces.UiDatosFlota.VD_NO_DATA;

public class ValidationNoDataFlota implements Question<Boolean> {

    // Localizador que apunta a las filas de resultados de la tabla
    private static final Target FILAS_TABLA = Target.the("Filas de la tabla")
            .locatedBy("//table/tbody/tr"); // Asegúrate de que esta ruta XPath sea correcta en tu aplicación

    @Override
    public Boolean answeredBy(Actor actor) {
        return VD_NO_DATA.resolveFor(actor).isVisible();
    }

    public static ValidationNoDataFlota noDataFlota(){
        return new ValidationNoDataFlota();
    }
}