package com.pinbus.qa.buscarviaje.exceptions;

public class SinConexionInternet extends AssertionError{
	public static final String No_CONEXION="No existe conexion estable a internet";

	public SinConexionInternet(String message, Throwable cause) {
		super(message, cause);	
	}
}
