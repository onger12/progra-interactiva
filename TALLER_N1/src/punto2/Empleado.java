package punto2;

import javax.swing.JOptionPane;

public abstract class Empleado {
	protected String nombre, apellido, direccion;
	protected int cc, antiguedad, tel, salario, ccSup, incremento;
	
	public Empleado (String nombre, String apellido, String direccion, int tel, int cc, int salario) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.tel = tel;
		this.cc = cc;
		this.salario = salario;
	}
	
	public abstract void imprimir();
	
	public void cambiarSupervisor(int cc) {
		this.ccSup = cc;
	}
	
	public void incrementarSalario (int suma) {
		this.salario += suma;
	}
}
