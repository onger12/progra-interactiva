package clasesAbstractas;

public class Principal {
	public static void main(String[] args) {
		//Circulo c1 = new Circulo(4);
		//No se pueden instanciar objetos abstractos
		
		Area1 a1 = new Area1(4);
		System.out.println("Radio A1 = " + a1.getRadio());
		
		Area2 a2 = new Area2(4);
		System.out.println("Radio A2 = " + a2.getRadio());
		
		Area3 a3 = new Area3(4);
		System.out.println("Radio A3 = " + a3.getRadio());

	}
}
