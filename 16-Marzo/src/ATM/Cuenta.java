package ATM;

public class Cuenta {
	
	private int numeroCuenta;
	private int nip;
	private double saldoDisponible;
	private double saldoTotal;
	
	public Cuenta(int nc, int nip, double sD, double st) {
		numeroCuenta = nc;
		this.nip = nip;
		saldoDisponible = sD;
		saldoTotal = st;
	}
	
	public boolean validarNip(int nipUsuario) {
		return nip == nipUsuario;
	}
	
	public void abonar(double monto) {
		saldoTotal += monto;
		saldoDisponible += monto;
	}
	
	public void retirar(double monto) {
		saldoTotal -= monto;
		saldoDisponible -= monto;
	}

	public int getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public double getSaldoDisponible() {
		return saldoDisponible;
	}

	public void setSaldoDisponible(double saldoDisponible) {
		this.saldoDisponible = saldoDisponible;
	}

	public double getSaldoTotal() {
		return saldoTotal;
	}

	public void setSaldoTotal(double saldoTotal) {
		this.saldoTotal = saldoTotal;
	}
	
}
