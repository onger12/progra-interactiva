package clasesAbstractas;

public abstract class Circulo {
	
	private double radio;
	
	public Circulo(double r) {
		this.radio = r;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	public abstract double area();
}
