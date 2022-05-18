package pelotas;

import javax.swing.JFrame;

public class Principal {
	public static void main(String[] args) {
		Ventana v = new Ventana();
		v.setSize(800,600);
		v.setLocationRelativeTo(null);
		v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		v.setVisible(true);
	}
}
