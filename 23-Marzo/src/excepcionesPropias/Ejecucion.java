package excepcionesPropias;

public class Ejecucion {

	public static double division(double a, double b) throws ErrorDivision{
		if(b != 0) return a/b;
		else throw new ErrorDivision();
	}
	
	public static void main(String[] args) {
		double resultado = 0.0;
		try {
			resultado = division(2, 0);
		}catch(ErrorDivision e) {
			try {
				resultado = division(2, e.getDenominador());
			}catch(ErrorDivision e2) {
				System.out.println("Error desconocido");
			}
		}
		System.out.println("El resultado es: " + resultado);
	}
}
