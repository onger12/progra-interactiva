package pelotas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JLabel;

public class Pelota extends Thread{
	private JLabel p;
	private Color c;
	private final int TAMANIO_X_PELOTA = 20;
	private final int TAMANIO_Y_PELOTA = 20;
	private int posX = 0;
	private int posY = 0;
	private int incrementoX = 2;
	private int incrementoY = 2;
	private int tiempo = 0;
	public static boolean bandera;
	
	public Pelota (JLabel p, Color c, int tiempo) {
		this.p = p;
		this.c = c;
		this.tiempo = tiempo;
		bandera = true;
	}
	
	public void dibujarPelota() {
		Graphics g = p.getGraphics();
		g.setColor(c);
		g.fillOval(posX, posY, TAMANIO_X_PELOTA, TAMANIO_Y_PELOTA);
		g.dispose(); //LIBERA LOS GRÁFICOS AL SISTEMA
	}
	
	public void mover() {
		Graphics g = p.getGraphics();
		g.setXORMode(p.getBackground()); //PREPARA LOS CONTEXTOS PARA DIBUJO EN COLORES
		g.setColor(c);
		g.fillOval(posX, posY, TAMANIO_X_PELOTA, TAMANIO_Y_PELOTA);
		posX += incrementoX;
		posY += incrementoY;
		Dimension dimension = p.getSize();
		
		if(posX < 0) {
			posX = 0;
			incrementoX = -incrementoX;
			c = Color.black;
		}
		if(posX > dimension.getWidth() - TAMANIO_X_PELOTA) {
			posX = (int) (dimension.getWidth() - TAMANIO_X_PELOTA);
			incrementoX = -incrementoX;
			c = Color.orange;
		}
		if(posY < 0) {
			posY = 0;
			incrementoY = -incrementoY;
			c = Color.red;
		}
		if(posY > dimension.getHeight() - TAMANIO_Y_PELOTA) {
			posY = (int)(dimension.getHeight()) - TAMANIO_Y_PELOTA;
			incrementoY = -incrementoY;
			c = Color.PINK;
		}
		dibujarPelota();
	}
	
	public void run() {
		dibujarPelota();
		while(bandera){
			mover();
			System.out.println(bandera);
			try {
				Thread.sleep(tiempo);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			//**************************************************//
		}
	}
}