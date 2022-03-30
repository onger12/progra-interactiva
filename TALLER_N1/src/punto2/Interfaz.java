package punto2;

import javax.swing.JOptionPane;

public class Interfaz {
	
	public int pedirAnnios() {
		return Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de años"));
	}
}
