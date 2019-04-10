package co.com.google.certificacion.logingmailscreenplay.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

import static co.com.google.certificacion.logingmailscreenplay.userinterfaces.GmailHomePage.VER_CONTRASEÑA;
import static co.com.google.certificacion.logingmailscreenplay.userinterfaces.GmailHomePage.BOTON_SIGUIENTE;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.google.certificacion.logingmailscreenplay.task.IniciarSesion;
import co.com.google.certificacion.logingmailscreenplay.userinterfaces.GmailHomePage;

public class VisualizadorContraseña implements Interaction{
		
	

	@Override
	@Step("{0} da click en ver contraeña y luego presiona siguiente")
	public <T extends Actor> void performAs(T actor) {
		GmailHomePage.VER_CONTRASEÑA.resolveFor(actor).click();
		GmailHomePage.BOTON_SIGUIENTE.resolveFor(actor).click();
		
	/*	actor.attemptsTo(
				Click.on(VER_CONTRASEÑA),
				Click.on(BOTON_SIGUIENTE)				
				);
		
		*/
	}
	
	public static VisualizadorContraseña verContraseñaYPresionarSiguiente() {
		
		return instrumented(VisualizadorContraseña.class);
	}
	
	
	
	
	
	

}
