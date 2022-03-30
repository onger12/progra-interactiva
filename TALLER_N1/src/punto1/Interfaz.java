package punto1;

import javax.swing.JOptionPane;

public class Interfaz {
	private int opc = 0;
	
	public int mostrarMenu() {
		String opcion = JOptionPane.showInputDialog(null, "*** Bienvenido a frikaloca, el juego de azar más popular de fondo de bikini! ***"
				+ "\nSelecciona una opción: "
				+ "\n1. Lanzar dado"
				+ "\n2. Elegir penitencia"
				+ "\n3. Crear dado"
				+ "\n4. Salir");
		
		opc = Integer.parseInt(opcion);
		return opc;
	}
	
	public void mostrarResultado(int valor) {
		JOptionPane.showMessageDialog(null, "El dado cayó en " + valor + "!!!");
	}
	
	public String pedirPenintencia() {
		String penitencia = JOptionPane.showInputDialog("Escribe la penitencia: ");
		return penitencia;
	}
	
	public int pedirCara() {
		String nCara = JOptionPane.showInputDialog("Para qué cara quieres cambiar la penitencia?");
		return Integer.parseInt(nCara);
	}
	
	public void mostrarPenitencia(String penitencia) {
		JOptionPane.showMessageDialog(null, penitencia);
	}
	
	public int pedirCaras() {
		String nCaras = JOptionPane.showInputDialog("Ingrese el numero de caras que tendrá el dado");
		int intNCaras = Integer.parseInt(nCaras);
		return intNCaras;
	}
	
	public void despedir() {
		JOptionPane.showMessageDialog(null, "Gracias por jugar frikaloca, adios!");
	}
}
