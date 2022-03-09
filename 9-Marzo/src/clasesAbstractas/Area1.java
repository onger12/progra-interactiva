package clasesAbstractas;

public class Area1 extends Circulo{

	public Area1(double r) {
		super(r);
	}

	@Override
	public double area() {
		return Math.PI * Math.pow(getRadio(), 2);
	}
	
}
