package punto1b;

import javax.swing.JOptionPane;

public class Interfaz {
	
	public String mostrarMenu() {
		return JOptionPane.showInputDialog("*** Cafeterita ***"
				+ "\nSelecciona una opción :)"
				+ "\n1. Llenar cafetera"
				+ "\n2. Servir taza"
				+ "\n3. Vaciar cafetera"
				+ "\n4. Agregar café"
				+ "\n5. Ver cantidad actual");
	}
	
	public int pedirCantidadCafe() {
		int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de café: "));
		return cantidad;
	}
	
	public void error() {
		JOptionPane.showMessageDialog(null, "Opción no válida");
	}
	
	public void mostrarCantidadCafetera(int cantidad) {
		JOptionPane.showMessageDialog(null, "La cantidad de café en la cafetera es: " + cantidad + " ml");
	}
}
