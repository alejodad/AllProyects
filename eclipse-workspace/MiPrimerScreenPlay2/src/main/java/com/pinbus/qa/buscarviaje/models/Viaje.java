package com.pinbus.qa.buscarviaje.models;

public class Viaje {
	private String strRutaIda;
	private String strRutaRgreso;
	private String strDiaIdA;
	private String strMesIda;
	private String srtAnoIda;
	private String strDiaRegreso;
	private String strMesRegreso;
	private String strAnoRegrso;
	public String getStrRutaIda() {
		return strRutaIda;
	}
	public void setStrRutaIda(String strRutaIda) {
		this.strRutaIda = strRutaIda;
	}
	public String getStrRutaRgreso() {
		return strRutaRgreso;
	}
	public void setStrRutaRgreso(String strRutaRgreso) {
		this.strRutaRgreso = strRutaRgreso;
	}
	public String getStrDiaIdA() {
		return strDiaIdA;
	}
	public void setStrDiaIdA(String strDiaIdA) {
		this.strDiaIdA = strDiaIdA;
	}
	public String getStrMesIda() {
		return strMesIda;
	}
	public void setStrMesIda(String strMesIda) {
		this.strMesIda = strMesIda;
	}
	public String getSrtAnoIda() {
		return srtAnoIda;
	}
	public void setSrtAnoIda(String srtAnoIda) {
		this.srtAnoIda = srtAnoIda;
	}
	public String getStrDiaRegreso() {
		return strDiaRegreso;
	}
	public void setStrDiaRegreso(String strDiaRegreso) {
		this.strDiaRegreso = strDiaRegreso;
	}
	public String getStrMesRegreso() {
		return strMesRegreso;
	}
	public void setStrMesRegreso(String strMesRegreso) {
		this.strMesRegreso = strMesRegreso;
	}
	public String getStrAnoRegrso() {
		return strAnoRegrso;
	}
	public void setStrAnoRegrso(String strAnoRegrso) {
		this.strAnoRegrso = strAnoRegrso;
	}
	
	public Viaje(String strRutaIda, String strRutaRgreso, String strDiaIdA, String strMesIda, String srtAnoIda,
			String strDiaRegreso, String strMesRegreso, String strAnoRegrso) {
		super();
		this.strRutaIda = strRutaIda;
		this.strRutaRgreso = strRutaRgreso;
		this.strDiaIdA = strDiaIdA;
		this.strMesIda = strMesIda;
		this.srtAnoIda = srtAnoIda;
		this.strDiaRegreso = strDiaRegreso;
		this.strMesRegreso = strMesRegreso;
		this.strAnoRegrso = strAnoRegrso;
	}
	public Viaje(String strRutaIda, String strDiaIdA, String strMesIda, String srtAnoIda) {
		super();
		this.strRutaIda = strRutaIda;
		this.strDiaIdA = strDiaIdA;
		this.strMesIda = strMesIda;
		this.srtAnoIda = srtAnoIda;
	}
	
	
	
	

}
