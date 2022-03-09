package clasesAbstractas;

public class Area3 extends Circulo{

	public Area3(double r) {
		super(r);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double area() {
		double resultado = 0;
		double limiteInferior, limiteSuperior, r = getRadio();
		limiteInferior = 0;
		limiteSuperior = (100 * Math.sqrt(r * r - 1000)) / 2 + ((r * r) / 2 * Math.asin(100/r));
		resultado = (limiteSuperior - limiteInferior) * 4;
		return resultado;
	}
	
}
