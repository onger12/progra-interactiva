package punto2;

import javax.swing.JOptionPane;

public class Secretario extends Empleado{

	private int despacho, fax, incremento = 5;
	
	public Secretario(String nombre, String apellido, String direccion, int tel, int cc, int salario, int despacho, int fax) {
		super(nombre, apellido, direccion, tel, cc, salario);
		this.despacho = despacho;
		this.fax = fax;
	}
	
	public void imprimir() {
		JOptionPane.showMessageDialog(null, "Secretario " + this.nombre + " " + this.apellido + " con CC " + this.cc + " direccion " 
	+ this.direccion + " y teléfono " + this.tel + "\nSalario " + this.salario);
	}

	public void reCalcularSalarios() {
		int aumento = (incremento * salario) / 100;
		salario += aumento;
	}
	
}
