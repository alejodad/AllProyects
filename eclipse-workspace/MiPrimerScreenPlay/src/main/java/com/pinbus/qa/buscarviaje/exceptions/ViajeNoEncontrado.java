package com.pinbus.qa.buscarviaje.exceptions;

public class ViajeNoEncontrado extends AssertionError{
	public static final String VIAJE_NO_ENCONTRADO="La busqueda noa rrojo resultados para las rutas y fechas especificadas";

	public ViajeNoEncontrado(String message, Throwable cause) {
		super(message, cause);	
	}
}
