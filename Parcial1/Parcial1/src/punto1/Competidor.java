package punto1;

public abstract class Competidor {
	protected int distancia = 1;
	protected String animal;
	
	public Competidor (String animal) {
		
	}
	
	protected abstract String realizarMovimiento(int index);
	protected abstract void modificarDistancia(int index);
	
	
}