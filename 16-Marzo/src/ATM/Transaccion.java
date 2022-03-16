package ATM;

public abstract class Transaccion {
	
	private int numeroCuenta;
	private Pantalla pantalla;
	private BaseDatosBanco baseDatosBanco;
	
	public Transaccion(int numeroCuentaUsuario, Pantalla atmPantalla, BaseDatosBanco atmBaseDatos)
	{
		numeroCuenta= numeroCuentaUsuario;
		pantalla= atmPantalla;
		baseDatosBanco= atmBaseDatos;
	}
	
	public int getNumeroCuenta()
	{
		return numeroCuenta;
	}
	
	public Pantalla getPantalla()
	{
		return pantalla;
	}
	
	public BaseDatosBanco getBaseDatosBanco()
	{
		return baseDatosBanco;
	}

	public abstract void ejecutar();
	
}
