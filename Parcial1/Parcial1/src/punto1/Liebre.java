package punto1;

public class Liebre extends Competidor{
	
	private String movimientos[] = {"Dormir", "Salto largo", "Resbalón grande", "Salto pequeño", "Resbalón pequeño"};

	public Liebre (String nombre) {
		super(nombre);
	}
	
	@Override
	protected String realizarMovimiento(int index) {
		return movimientos[index];
	}

	@Override
	protected void modificarDistancia(int index) {
		if(index == 1) {
			distancia+=9;
		}else if(index == 2) {
			if(distancia - 8 <= 7) {
				distancia = 1;
			}else {
				distancia-=8;
			}
		}else if (index == 3){
			distancia+=1;
		}else if(index == 4) {
			if(distancia - 2 <= 7) {
				distancia = 1;
			}else {
				distancia-= 2;
			}
		}
	}

}
