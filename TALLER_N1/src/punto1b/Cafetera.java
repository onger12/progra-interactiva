package punto1b;

public class Cafetera {
	private int capacidadMaxima;
	private int cantidadActual;
	
	public Cafetera() {
		this.capacidadMaxima = 1000;
		this.cantidadActual = 0;
	}
	
	public Cafetera(int cMax) {
		this.capacidadMaxima = cMax;
		this.cantidadActual = cMax;
	}
	
	public Cafetera(int cMax, int cInt) {
		this.capacidadMaxima = cMax;
		this.cantidadActual = cInt;
		if(cInt > cMax) {
			this.cantidadActual = this.capacidadMaxima; 
		}
	}
	
	public void llenarCafetera() {
		this.cantidadActual = this.capacidadMaxima;
	}
	
	public void servirTaza(int cantidad) {
		if(this.cantidadActual > cantidad) {
			this.cantidadActual -= cantidad;
		}else {
			this.cantidadActual = 0;
		}
	}
	
	public void vaciarCafetera() {
		this.cantidadActual = 0;
	}
	
	public void agregarCafe(int cantidad) {
		if(cantidad + capacidadMaxima < capacidadMaxima) {
			this.cantidadActual += cantidad;
		}else {
			cantidadActual = capacidadMaxima; 
		}
	}
	
	public int getCantidadActual() {
		return cantidadActual;
	}
}
