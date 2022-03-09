package Static;

public class Prueba {
	public static void main(String[] args) {
		ProbandoStatica p1 = new ProbandoStatica();
		System.out.println("Para p1: " + p1.getCantidad());

		ProbandoStatica p2 = new ProbandoStatica();
		System.out.println("Para p2: " + p2.getCantidad());

		ProbandoStatica p3 = new ProbandoStatica();
		System.out.println("Para p3: " + p3.getCantidad());
		
		ProbandoStatica p4 = new ProbandoStatica();
		ProbandoStatica p5 = new ProbandoStatica();
		System.out.println("Para p5: " + p5.getCantidad());
	}
}
