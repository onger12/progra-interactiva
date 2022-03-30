package punto2;

import java.util.Vector;
import javax.swing.JOptionPane;

public class JefeOficina extends Empleado{
	
	private int codigoOficina, ccSecretario, incremento = 20;
	String placa, modelo, marca;
	private Secretario secretario;
	private Vector <Vendedor> vendedores;

	public JefeOficina(String nombre, String apellido, String direccion, int tel, int cc, int salario, int codigoOficina,
			Secretario secretario, String placa, String modelo, String marca) {
		super(nombre, apellido, direccion, tel, cc, salario);
		this.codigoOficina = codigoOficina;
		this.secretario = secretario;
		this.ccSecretario = secretario.cc;
		this.placa = placa;
		this.modelo = modelo;
		this.marca = marca;
	}

	public void imprimir() {
		JOptionPane.showMessageDialog(null, "Jefe de oficina " + this.nombre + " " + this.apellido + " con CC " + this.cc + " direccion " 
	+ this.direccion + " teléfono " + this.tel + ", numero de oficina " + this.codigoOficina + ".\nCarro con placas " + this.placa 
	+ ", modelo" + modelo + " y marca " + marca + "\nSalario " + this.salario);
	}
	
	public void cambiarSecretario(Secretario secretario) {
		this.secretario = secretario;
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
