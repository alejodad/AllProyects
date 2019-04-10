package com.pinbus.qa.buscarviaje.questions;

import com.pinbus.qa.buscarviaje.userinterfaces.PinbusResultPage;
import com.pinbus.qa.buscarviaje.util.VerificarConexion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import com.pinbus.qa.buscarviaje.util.VerificarConexion;

@Subject("validar conexion de internet")
public class ResultadoConexion implements Question<Boolean>  {
	
	public ResultadoConexion() {
		
	}

	@Override
	public Boolean answeredBy(Actor actor) {
		
		// TODO Auto-generated method stub
		return VerificarConexion.VerificarConexionIntenet();
	}
	
	public static ResultadoConexion conectar() {
		return new ResultadoConexion();
	}

}
