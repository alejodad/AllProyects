package com.pinbus.qa.buscarviaje.userinterfaces;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class PinbusResultPage extends PageObject {
	
	public static final Target grpResults = Target.the("los resultados")    		
            .locatedBy("//div[contains(@class,'filter-box results')]");
}
