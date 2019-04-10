package com.pinbus.qa.buscarviaje.userinterfaces;
import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://pinbus.com/")
public class PinbusHomePage extends PageObject{
	public static final Target inputOrigen = Target.the("el textbox del origen")    		
            .locatedBy("//input[@placeholder='Ingresa tu Origen']");
	
	public static final Target lsbAutocompletar = Target.the("lista autocompletar")    		
            .locatedBy("//div[contains(@class,'v-autocomplete-list)]");
	
	public static final Target inputDestino = Target.the("el textbox del destino")    		
            .locatedBy("//input[@placeholder='Destino']");
	
	public static final Target inputFechaIda = Target.the("el textbox de la fecha de ida")    		
            .locatedBy("//input[contains(@placeholder,'Salida')]");
	
	public static final Target inputFechaRegreso = Target.the("el textbox de la fecha de regreso")    		
            .locatedBy("//input[contains(@placeholder,'Regreso (opcional)')]");
	
	public static final Target btnBuscar = Target.the("El boton de buscar")    		
            .locatedBy("//button[@id='btn_buscar']");


}
