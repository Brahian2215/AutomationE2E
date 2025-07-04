package co.edu.udea.certificacion.monitoreoyreportes.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class UiDatosFlota {
    public static final Target INPUT_TEXT = Target.the("Input Text").locatedBy("//*[@id=\'__next\']/div/div[2]/div[1]/input");
    public static final Target BUTTON_FIND = Target.the("Button Find").locatedBy("//*[@id=\'__next\']/div/div[2]/div[1]/button");
    public static final Target VD_DATA_FLOTA = Target.the("Data Flota").locatedBy("//*[@id=\'__next\']/div/div[2]/div[2]/table/thead/tr/th[2]");
    public static final Target VD_NO_DATA = Target.the("Sin resultado").locatedBy("//p[contains(text(),'Sin resultados')]");

}