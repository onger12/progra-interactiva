package interfaz;

public class Datos {
	protected int x;
	protected int y;
	protected int alto;
	protected int ancho;
	
	public Datos() {}
	public Datos(int x, int y, int w, int h) {
		this.x = x;
		this.y = y;
		this.ancho = w;
		this.alto = h;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getAlto() {
		return alto;
	}
	public void setAlto(int alto) {
		this.alto = alto;
	}
	public int getAncho() {
		return ancho;
	}
	public void setAncho(int ancho) {
		this.ancho = ancho;
	}
	
}
