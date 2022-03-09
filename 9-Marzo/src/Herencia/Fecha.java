package Herencia;

import java.util.StringTokenizer;

public class Fecha {

	private int dia;
	private int mes;
	private int anio;
	
	public Fecha() {
		
	}
	
	public Fecha(int dia, int mes, int anio) {
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}
	//  -->  17/07/2000
	public Fecha(String dato) {
		StringTokenizer st = new StringTokenizer(dato, "/");
		this.dia = Integer.parseInt(st.nextToken());
		this.mes = Integer.parseInt(st.nextToken());
		this.anio = Integer.parseInt(st.nextToken()); 
	}
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	
	
}
