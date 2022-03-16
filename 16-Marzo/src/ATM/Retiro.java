package ATM;

public class Retiro extends Transaccion{

	private int monto;
	private Teclado teclado;
	private DispensadorEfectivo dispensadorEfectivo;
	private final int CANCELADO = 6;
	
	public Retiro(int numeroCuentaUsuario, Pantalla pantalla, BaseDatosBanco baseDatosBanco, Teclado teclado, DispensadorEfectivo dispensadorEfectivo) {
		super(numeroCuentaUsuario, pantalla, baseDatosBanco);
		this.teclado = teclado;
		this.dispensadorEfectivo = dispensadorEfectivo;
	}
	
	public void ejecutar () {
		boolean dineroEntregado = false;
		double saldoDisponible;
		
		BaseDatosBanco baseDatosBanco = getBaseDatosBanco();
		Pantalla pantalla = getPantalla();
				
		do{
			monto = pantallaMenuCantidades();
			if(monto != CANCELADO) {
				saldoDisponible = baseDatosBanco.getsaldoDisponible(getNumeroCuenta());
				if(monto <= saldoDisponible) {
					if(dispensadorEfectivo.haySuficienteDinero(monto)) {
						baseDatosBanco.retirar(getNumeroCuenta(), monto);
						dispensadorEfectivo.dispensarEfectivo(monto);
						dineroEntregado = true;
						pantalla.mostrarMensajeLinea("Por favor tome su dinero :)");
					}else {
						pantalla.mostrarMensajeLinea("Dinero insuficiente en este cajero! :c");
					}
				}else {
					pantalla.mostrarMensajeLinea("Fondos insuficientes, aragán!");
				}
			}else {
				pantalla.mostrarMensajeLinea("Transacción cancelada!");
			}
			
		}while(!dineroEntregado);
	}
	
	private int pantallaMenuCantidades() {
		int opc = 0;
		Pantalla pantalla = getPantalla();
		int montos[] = {0, 20, 40, 60, 100, 200};
		
		while(opc == 0) {
			pantalla.mostrarMensajeLinea("Menu de retiro ");
			System.out.println("-------------------------------------");
			System.out.println("--- Escoja la cantidad a retirar: ---");
			System.out.println("-------------------------------------");
			pantalla.mostrarMensajeLinea("1. Retirar 20");
			pantalla.mostrarMensajeLinea("2. Retirar 40");
			pantalla.mostrarMensajeLinea("3. Retirar 60");
			pantalla.mostrarMensajeLinea("4. Retirar 100");
			pantalla.mostrarMensajeLinea("5. Retirar 200");
			pantalla.mostrarMensajeLinea("6. Cancelar la transacción");
			
			int entrada = teclado.getEntrada();
			
			switch(entrada) {
				case 1: opc = montos[entrada]; break;
				case 2: opc = montos[entrada]; break;
				case 3: opc = montos[entrada]; break;
				case 4: opc = montos[entrada]; break;
				case 5: opc = montos[entrada]; break;
				case CANCELADO: opc = CANCELADO; break;
				default: pantalla.mostrarMensajeLinea("Opción no válida, intente de nuevo"); break;
			}
		}// --> Aquí acaba el while		
		return opc;
	}
}
