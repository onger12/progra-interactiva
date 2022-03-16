package ATM;

import javax.swing.JOptionPane;

public class Pantalla {

	public void mostrarMensaje(String mensaje) {
		System.out.print(mensaje);
	}

	public void mostrarMensajeLinea(String mensaje) {
		System.out.println(mensaje);
	}
	
	public void mostrarMontoPesos(double monto) {
		System.out.printf("$%,.2f", monto); // pesos parte entera coma dos decimales
	}
}
