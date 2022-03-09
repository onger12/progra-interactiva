package clasesAbstractas;

public class Area2 extends Circulo{

	public Area2(double r) {
		super(r);
	}

	@Override
	public double area() {
		return Math.PI * Math.pow(getRadio(), 3);
	}
	
}
