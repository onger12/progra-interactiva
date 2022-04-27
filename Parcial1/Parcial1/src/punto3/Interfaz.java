package punto3;

import javax.swing.JOptionPane;

public class Interfaz {
	public void mostrarMensaje(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje);
	}
	
	public String pedirDato(String mensaje) {
		return JOptionPane.showInputDialog(mensaje);
	}
}
