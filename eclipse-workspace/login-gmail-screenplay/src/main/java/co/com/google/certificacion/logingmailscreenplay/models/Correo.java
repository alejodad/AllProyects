package co.com.google.certificacion.logingmailscreenplay.models;

public class Correo {
	private String destinatario;
	private String asunto;
	private int cantidad;
	
	public Correo(String destinatario, String asunto) {
		this.destinatario = destinatario;
		this.asunto = asunto;
	}
	public Correo(String destinatario, String asunto,int cantidad) {
		this.destinatario = destinatario;
		this.asunto = asunto;
		this.cantidad=cantidad;
	}
	
	public String getDestinatario() {
		return destinatario;
	}

	public String getAsunto() {
		return asunto;
	}
	
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	
	

}
