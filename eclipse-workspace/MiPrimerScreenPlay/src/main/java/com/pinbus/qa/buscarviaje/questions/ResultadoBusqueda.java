package com.pinbus.qa.buscarviaje.questions;

import net.serenitybdd.screenplay.Question;

import com.pinbus.qa.buscarviaje.userinterfaces.PinbusResultPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;

@Subject("validar resultado")
public class ResultadoBusqueda implements Question<String> {

	public ResultadoBusqueda() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String answeredBy(Actor actor) {
		
		// TODO Auto-generated method stub
		return PinbusResultPage.grpResults.resolveFor(actor).waitUntilVisible().getValue();
	}
	
	public static ResultadoBusqueda searched() {
		return new ResultadoBusqueda();
	}
	
}
