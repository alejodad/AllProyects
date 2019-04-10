package com.pinbus.qa.buscarviaje.util;

import java.net.HttpURLConnection;
import java.net.URL;

import org.openqa.selenium.JavascriptExecutor;

public class VerificarConexion {
	
	private static URL direccionDePrueba;
	private static HttpURLConnection pruebaConexion;
	private static int codigohtml;
	private static int tiempoDeConexionMiliSegundos = 4000;
	
	
	/**
	 * Este evento retorna un booleano el cual indica s hay o no conexion
	 * @return
	 */
public static Boolean VerificarConexionIntenet() {
	

	try {	
		direccionDePrueba = new URL("https://www.mercadolibre.com.co");
		pruebaConexion = (HttpURLConnection) direccionDePrueba.openConnection();
		pruebaConexion.setRequestMethod("HEAD");
		pruebaConexion.setConnectTimeout(tiempoDeConexionMiliSegundos);
		pruebaConexion.setReadTimeout(tiempoDeConexionMiliSegundos);
		codigohtml = pruebaConexion.getResponseCode();
		if (200 <= codigohtml && codigohtml <= 400) {
			return true;
		}else {
			return false;
		}
	} catch (Exception ex) {	
		return false;
	}
}
}
