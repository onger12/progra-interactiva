package datosBasicos;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Switch {

	public static final int LUNES = 1;
	public static final int MARTES = 2;
	public static final int MIERCOLES = 3;
	public static final int JUEVES = 4;
	public static final int VIERNES = 5;
	public static final int SABADO = 6;
	public static final int DOMINGO = 7;
	
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Ingresa un día por numero: ");
//		int dia = sc.nextInt();
		int dia = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero"));
		
		String mensaje = "El día es: ";
		switch (dia) {
			case LUNES:
				mensaje += " Lunes";
				break;
			case MARTES:
				mensaje += " Martes";
				break;
			case MIERCOLES:
				mensaje += " Miercoles";
				break;
			case JUEVES:
				mensaje += " Jueves";
				break;
			case VIERNES:
				mensaje += " Viernes";
				break;
			case SABADO:
				mensaje += " Sabado";
				break;
			case DOMINGO:
				mensaje += " Domingo";
				break;
			default:
				mensaje = "Chamo eso no lo sabo";
		}
		System.out.println(mensaje);
	}
}
