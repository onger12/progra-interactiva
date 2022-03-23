package ATM;

public class Deposito extends Transaccion{

	private RanuraDeposito ranuraDeposito;
	private Pantalla pantalla;
	private Teclado teclado;
	
	private double monto = 0.0;
	private final int CANCELADO = 0;
	
	public Deposito (int numeroCuentaUsuario, Pantalla pantalla, BaseDatosBanco baseDatosBanco, Teclado teclado, 
			RanuraDeposito ranuraDeposito) {
		super(numeroCuentaUsuario, pantalla, baseDatosBanco);
			this.teclado = teclado;
			this.ranuraDeposito = ranuraDeposito;
	}
	
	public void ejecutar() {
		BaseDatosBanco baseDatosBanco = getBaseDatosBanco();
		Pantalla pantalla = getPantalla();
		
		monto = dineroDepositado();
		
		if(monto != CANCELADO) {
			pantalla.mostrarMensaje("Dinero ingresado: " + monto);
			pantalla.mostrarMontoPesos(monto);
			pantalla.mostrarMensajeLinea("");
			
			boolean dineroRecibido = ranuraDeposito.hayMontoRecibido();
			if(dineroRecibido) {
				pantalla.mostrarMensajeLinea("Su depósito se ingresó con éxito\n"
						+ "El dinero estará disponible mañana\n"
						+ "Por favor verifique el depósito");
				baseDatosBanco.abonar(getNumeroCuenta(), monto);
			}else {
				pantalla.mostrarMensajeLinea("Usted no ingresó el dinero a tiempo, intentelo de nuevo");
			}
		}else {
			pantalla.mostrarMensajeLinea("El ATM canceló la transacción");
		}
	}
	
	private double dineroDepositado() {
		Pantalla pantalla = getPantalla();
		pantalla.mostrarMensajeLinea("Por favor ingrese un depósito en PESOS o presione 0 para cancelar");
		int entrada = teclado.getEntrada();
		if (entrada==CANCELADO) return CANCELADO;
		else return (double)entrada;
	}
	
}
