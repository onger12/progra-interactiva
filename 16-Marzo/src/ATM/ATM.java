package ATM;

public class ATM {

	private boolean usuarioAutenticado;
	private int numeroCuenta;
	private Pantalla pantalla;
	private Teclado teclado;
	private DispensadorEfectivo dispensadorEfectivo;
	private RanuraDeposito ranuraDeposito;
	private BaseDatosBanco baseDatosBanco;
	
	private static final int CONSULTA_SALDO = 1;
	private static final int RETIRO = 2;
	private static final int DEPOSITO= 3;
	private static final int SALIR = 4;
	
	public ATM () {
		usuarioAutenticado = false;
		numeroCuenta = 0;
		pantalla = new Pantalla();
		teclado = new Teclado();
		dispensadorEfectivo = new DispensadorEfectivo();
		ranuraDeposito = new RanuraDeposito();
		baseDatosBanco = new BaseDatosBanco();
	}
	
	public void usuarioAutenticado() {
		pantalla.mostrarMensaje("Por favor ingrese su numero de cuenta: ");
		int numeroCuenta = teclado.getEntrada();
		pantalla.mostrarMensaje("\nIngrese su NIP: ");
		int nip = teclado.getEntrada();
		
		usuarioAutenticado = baseDatosBanco.usuarioAutenticado(numeroCuenta, nip);
		
		if(usuarioAutenticado) {
			this.numeroCuenta = numeroCuenta;
		}else {
			pantalla.mostrarMensajeLinea("Usuario y/o contraseña incorrectos");
		}
	}
	
	private int mostrarMenuPrincipal() {
		pantalla.mostrarMensajeLinea("\n\nMenú principal");
		pantalla.mostrarMensajeLinea("1. Consultar saldo");
		pantalla.mostrarMensajeLinea("2. Retirar dinero");
		pantalla.mostrarMensajeLinea("3. Depositar dinero");
		pantalla.mostrarMensajeLinea("4. Salir");
		pantalla.mostrarMensaje("Digite una opcion ");
		return teclado.getEntrada();
	}
	
	private Transaccion crearTransaccion(int opc) {
		Transaccion resultado = null;
		switch(opc) {
		case CONSULTA_SALDO:
			resultado = new Consultas(numeroCuenta, pantalla, baseDatosBanco);
			break;
		case RETIRO:
			resultado = new Retiro(numeroCuenta, pantalla, baseDatosBanco, teclado, dispensadorEfectivo);
			break;
		case DEPOSITO:
			resultado = new Deposito(numeroCuenta, pantalla, baseDatosBanco, teclado, ranuraDeposito);
			break;
		}
		return resultado;
	}
	
	private void realizarTransaccion() {
		Transaccion transaccionActual = null;
		boolean salidaUsuario = false;
		
		while(!salidaUsuario) {
			 int opc = mostrarMenuPrincipal();
			 switch(opc) {
			 	case CONSULTA_SALDO:
			 		transaccionActual = crearTransaccion(opc);
			 		transaccionActual.ejecutar();
			 		break;
			 	case RETIRO:
					transaccionActual= crearTransaccion(opc);
					transaccionActual.ejecutar();
			 		break;
			 	case DEPOSITO:
					transaccionActual= crearTransaccion(opc);
					transaccionActual.ejecutar();
			 		break;
			 	case SALIR:
			 		pantalla.mostrarMensajeLinea("Saliendo del sistema...");
			 		salidaUsuario = true;
			 		break;
			 	default:
			 		pantalla.mostrarMensajeLinea("Opcion no válida, intente de nuevo");
			 		break;
			 }
		}
	}
	
	public void ejecutar() {
		while(true) {
			while(!usuarioAutenticado) {
				pantalla.mostrarMensajeLinea("************************************************");
				pantalla.mostrarMensajeLinea("\nBienvenido");
				usuarioAutenticado();
			}
			realizarTransaccion();
			usuarioAutenticado = false;
			numeroCuenta = 0;
			pantalla.mostrarMensajeLinea("Gracias!");
		}
	}
	
}
