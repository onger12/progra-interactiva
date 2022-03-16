package interfaz;

import java.awt.Graphics;

import javax.swing.JFrame;

public class Main extends JFrame{
	
	private static Datos d;
	private static Circulo c;
	
	public Main(String nombre) {
		super(nombre);
	}
	
	public void pintar() {
		Graphics g = super.getGraphics();
		g.drawString("Area del circulo: " + c.areaCirculo(), 50, 50);
		c.pintarCirculo(g);
	}
	
	public static void main(String[] args) {
		d = new Datos(100, 100, 50, 50);
		c = new Circulo(d.getX(), d.getY(), d.getAncho(), d.getAlto());
		
		Main p = new Main("Ejemplo interfaces");
		p.setSize(600, 600);
		p.setVisible(true);
		p.pintar();
	}
	
}
