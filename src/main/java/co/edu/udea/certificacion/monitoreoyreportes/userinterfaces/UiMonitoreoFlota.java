package co.edu.udea.certificacion.monitoreoyreportes.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class UiMonitoreoFlota {
    public static final Target BUTTON_UPDATE = Target.the("Button Update").locatedBy("//*[@id=\'__next\']/div/div[3]/div[1]/button");
    public static final Target VD_DATA_MONITOREO = Target.the("Monitoreo Actualizado").locatedBy("//table//td[contains(text(),'Actualizado')]");
    public static final Target VD_NO_UPDATE = Target.the("Error de Actualizacion").locatedBy("//p[contains(text(),'No se pudo actualizar la información')]");
}
