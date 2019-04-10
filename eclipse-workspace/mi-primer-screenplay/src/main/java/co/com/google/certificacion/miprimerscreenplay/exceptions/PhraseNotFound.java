package co.com.google.certificacion.miprimerscreenplay.exceptions;

public class PhraseNotFound extends AssertionError  {
	
	public static final String PHRASE_NOT_FOUND="La frase encontrada no corresponde a la busqueda";

	public PhraseNotFound(String message, Throwable cause) {
		super(message, cause);	
	}
	
	}
