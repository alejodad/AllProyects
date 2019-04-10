package co.com.google.certificacion.miprimerscreenplay.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://www.google.com")
public class GoogleHomePage extends PageObject {
    public static final Target SEARCH_BAR = Target.the("la barra de busqueda")    		
            .located(By.name("q"));
    
    public static final Target SEARCH_BUTTON = Target.the("boton buscar")
            .located(By.name("btnK"));
}
