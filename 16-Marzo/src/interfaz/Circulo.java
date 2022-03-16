package interfaz;

import java.awt.Color;
import java.awt.Graphics;

public class Circulo extends Datos implements A, B{

	//Datos d; -> Metodo rudimental
	
	public Circulo (int x, int y, int w, int h) {
		this.x = x;
		this.y = y;
		this.ancho = w;
		this.alto = h;
	}

	@Override
	public double areaCirculo() {
		double area = Math.PI * Math.pow((ancho / 2), 2);
		System.out.println("Area: " + area);
		return area;
	}

	@Override
	public void pintarCirculo(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillOval(this.x, this.y, this.ancho, this.alto);
	}
	
}
