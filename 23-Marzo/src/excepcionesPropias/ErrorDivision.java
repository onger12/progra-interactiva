package excepcionesPropias;

public class ErrorDivision extends Exception
{
	private final double DENOMINADOR = 1.0;
	
	public ErrorDivision() 
	{
		System.out.println("Error, división no definida");
	}
	
	public double getDenominador() {
		return DENOMINADOR;
	}
}
