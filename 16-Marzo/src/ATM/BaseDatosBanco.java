package ATM;

public class BaseDatosBanco {

	private Cuenta cuentas[];
	
	public BaseDatosBanco() {
		cuentas = new Cuenta[2];
		cuentas[0] = new Cuenta(12345, 54321, 1000.0, 1200.0);
		cuentas[1] = new Cuenta(6789, 9876, 200.0, 200.0);
	}
	
	private Cuenta getCuenta(int numCuenta) {
		for(Cuenta cuentaActual: cuentas) {
			if(cuentaActual.getNumeroCuenta() == numCuenta) { return cuentaActual; }
		}
		return null;
	}
	
	public boolean usuarioAutenticado (int numCuenta, int nip) {
		Cuenta cuentaUsuario = getCuenta(numCuenta);
		if(cuentaUsuario != null) {
			return cuentaUsuario.validarNip(nip);
		}else {return false;}
	}
	
	public void abonar(int numeroCuentaUsuario, double monto) {
		getCuenta(numeroCuentaUsuario).abonar(monto);
	}
	
	public void retirar (int numeroCuentaUsuario, double monto) {
		getCuenta(numeroCuentaUsuario).retirar(monto);
	}
	
	public double getsaldoDisponible(int numeroCuentaUsuario) {
		return getCuenta(numeroCuentaUsuario).getSaldoDisponible();
	}
	
	public double getsaldoTotal(int numeroCuentaUsuario) {
		return getCuenta(numeroCuentaUsuario).getSaldoTotal();
	}
}
