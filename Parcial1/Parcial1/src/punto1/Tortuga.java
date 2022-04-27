package punto1;

public class Tortuga extends Competidor{
	
	private String movimientos[] = {"Paso rápido", "Resbalón", "Paso lento"};
	
	public Tortuga (String animal) {
		super(animal);
	}

	@Override
	protected String realizarMovimiento(int index) {
		return movimientos[index];
	}

	@Override
	protected void modificarDistancia(int index) {
		if(index == 0) {
			distancia+=3;
		}else if(index == 1) {
			if(distancia - 5 <= 7) {
				distancia = 1;
			}else {
				distancia-=5;
			}
		}else if (index == 1){
			distancia+=1;
		}
	}
	
}
