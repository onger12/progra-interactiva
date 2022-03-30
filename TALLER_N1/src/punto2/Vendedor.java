package punto2;

import javax.swing.JOptionPane;

public class Vendedor extends Empleado{
	
	private String marca, placa, modelo;
	private int celular, areaVenta, porcentajeVentas, incremento = 10;
	
	public Vendedor(String nombre, String apellido, String direccion, int tel, int cc, int salario, String marca, String placa,
			String modelo, int celular, int areaVenta, int porcentajeVentas) {
		
		super(nombre, apellido, direccion, tel, cc, salario);
		this.marca = marca;
		this.placa = placa;
		this.modelo = modelo;
		this.celular = celular;
		this.areaVenta = areaVenta;
		this.porcentajeVentas = porcentajeVentas;
	}
	
	public void imprimir() {
		JOptionPane.showMessageDialog(null, "Vendedor " + this.nombre + " " + this.apellido + ", con CC " + this.cc + ", direccion " 
	+ this.direccion + ", teléfono " + this.tel + ", celular " + celular + ".\nCarro con placas " + this.placa 
	+ ", modelo" + modelo + " y marca " + marca + "\nSalario " + this.salario);
	}
	
	public void cambiarCarro(String marca, String modelo, String placa) {
		this.placa = placa;
		this.modelo = modelo;
		this.marca = marca;
	}
	
	public void reCalcularSalarios() {
		int aumento = (incremento * salario) / 100;
		salario += aumento;
	}
}
