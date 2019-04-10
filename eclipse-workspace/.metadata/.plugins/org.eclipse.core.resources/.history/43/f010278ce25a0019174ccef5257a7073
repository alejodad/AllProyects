package com.pinbus.qa.buscarviaje.task;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Wait;

import com.pinbus.qa.buscarviaje.userinterfaces.PinbusHomePage;
import com.pinbus.qa.buscarviaje.userinterfaces.PinbusResultPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.actions.SendKeysIntoTarget;
import net.serenitybdd.screenplay.matchers.statematchers.IsVisibleMatcher;
import net.serenitybdd.screenplay.matchers.statematchers.isClickableMatcher;
import net.serenitybdd.screenplay.questions.Visibility;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.serenitybdd.screenplay.waits.WaitUntilTargetIsReady;

public class BuscarViaje implements Task{
	private String ruta;
	private String ruta2;
	
	public BuscarViaje(String ruta,String ruta2) {
		this.ruta = ruta;
		this.ruta2 = ruta2;
		
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Enter.theValue(ruta).into(PinbusHomePage.inputOrigen).thenHit(Keys.TAB),				
				Enter.theValue(ruta2).into(PinbusHomePage.inputDestino).thenHit(Keys.TAB),
				Click.on(PinbusHomePage.btnBuscar)				
				);
		
	}
	
	public static BuscarViaje enLasRutas(String ruta, String ruta2) {
		return instrumented(BuscarViaje.class, ruta,ruta2);
	}
	

}
