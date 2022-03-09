package Static;

public class ProbandoStatica {
	
	private static int cantidad = 0;
	
	public ProbandoStatica() {
		cantidad ++;
	}
	
	public int getCantidad() {
		return cantidad;
	}
}
