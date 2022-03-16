package ATM;

public class Consultas extends Transaccion{
	
	public Consultas(int numeroCuentaUsuario, Pantalla pantalla, BaseDatosBanco baseDatosBanco) {
		super(numeroCuentaUsuario, pantalla, baseDatosBanco);
	}
	
	public void ejecutar() {
		Pantalla pantalla = getPantalla();
		BaseDatosBanco baseDatosBanco = getBaseDatosBanco();
		
		pantalla.mostrarMensajeLinea("Información consulta de saldo");
		pantalla.mostrarMensajeLinea("El saldo total de su cuenta es: " + baseDatosBanco.getsaldoTotal(getNumeroCuenta()));
		pantalla.mostrarMensajeLinea("El saldo disponible en su cuenta es: " + baseDatosBanco.getsaldoDisponible(getNumeroCuenta()));
	}
	
}
