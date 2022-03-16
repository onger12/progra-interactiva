package ATM;

public class DispensadorEfectivo {

	private static final int CUENTA_INICIAL = 500;
	private int cuenta;
	
	public DispensadorEfectivo () {
		this.cuenta = CUENTA_INICIAL;
	}
	
	public void dispensarEfectivo(int monto) {
		int dineroRequerido = monto / 20;
		cuenta -= monto;
	}
	
	public boolean haySuficienteDinero (int monto) {
		int dineroRequerido = monto / 20;
		return cuenta >= dineroRequerido;
	}
}
